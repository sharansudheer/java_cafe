package java_class;
class cake{
	String name;
	double rate;
	cake(String a, double r){
		name=a;
		rate=r;
	}
	public double calcprice() {
		return 0.0;
		
	}
	public String toString() {
		//return "I am a cake" + this.hashCode();
		return name + "\t" +rate;
	}
	cake high_price(cake obj){
		if(rate>obj.rate) 
			return this;
		else
			return obj;
	}
}
class ordered_cake extends cake{
	int weight;
	ordered_cake(String a, double b, int c){
		super(a,b);
		weight=c;		
	}
	public double calcprice() {
		rate *=weight;
		return rate;
		
	}
	
}
class readymade_cake extends cake{
	int quantity;
	readymade_cake(String a, double b, int c){
		super(a,b);
		quantity=c;		
	}
	public double calcprice() {
		rate *=quantity;
		return rate;
		
	}
	public String toString() {
		//return "I am a cake" + this.hashCode();
		return name + "\t" +rate + "\t Qyn" + quantity;
	}
	
}
public class cake_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cake items[]= new cake[5];
		items[0]= new cake("Honey",400.0);
		items[1]=new ordered_cake("Nuts", 750.0, 3);
		items[2]=new ordered_cake("Chocolate", 7500.0, 3);
		items[3] = new readymade_cake("Fruit of forest", 1200, 4);
		items[4]=new readymade_cake("plum", 120, 4);
		cake highest= new cake("None", 0.0);
		for(int i=0; i<items.length; i++) {
			items[i].calcprice();
			System.out.println(items[i]);
			System.out.println("----------------");
			highest = highest.high_price(items[i]);
		}
		System.out.println("The hightest sale "+ highest);
		System.out.println("SARAN SUDHEER URK19CS1105");
		
	}

}
