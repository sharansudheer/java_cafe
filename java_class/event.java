package java_class;
interface even_t{
	default void welcome_msg() {
		System.out.println("Welecome to the event, Hi I'm Saran Sudheer, URK19CS1105, from the second year CSE department");
	}
	static void thank_u() {
		System.out.println("Thanks for coming for the event");
	}
	double expenditure();
	void prizes();
	
}
interface invitation{
	String msg="Welcome to the great event of";
	void design_invi();
	void display_invi();
}
class symposium implements even_t,invitation{
	String name;
	int mem_count;
	String return_gift;
	String date;
	String venue;
	symposium(String a,  int d, String x, String y, String z){
		name=a;
		mem_count=d;
		return_gift=x;
		date=y;
		venue=z;
		
	}

	@Override
	public void design_invi() {
		// TODO Auto-generated method stub
		System.out.println("Date: "+date+" Venue: "+venue);
		System.out.println("All are invited");
		
	}

	@Override
	public void display_invi() {
		// TODO Auto-generated method stub
		welcome_msg();
		System.out.println("Hello all \nHere is a Technical Symposium on the topic "+name);
		
		design_invi();
		even_t.thank_u();
	}
	void internal_details() {
		System.out.println("Expenditure of the symposium= "+ expenditure());
		System.out.println("The prize is ");
		prizes();
		
	}

	@Override
	public double expenditure() {
		// TODO Auto-generated method stub
		return(mem_count*3000);
	}

	@Override
	public void prizes() {
		// TODO Auto-generated method stub
		System.out.println(return_gift);
		
	}
	
}

public class event {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		symposium obj=new symposium("Tensorflow",50,"watch","22/10/2018","Lulu convention centre");
		obj.display_invi();
		System.out.println("--------------------------------");
		obj.internal_details();
		
		
		
		

	}

}
