package java_class;

import java.util.Scanner;

class toll{
	int paycar;
	int non_pay;
	toll(){
		paycar=0;
		non_pay=0;
	}
	void pay() {
		paycar +=1;
	}
	void nonpay() {
		non_pay +=1;
	}
	int dis_p() {
		return paycar;
	}
	int dis_np() {
		return non_pay;
	}
}

public class toolboth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		toll tollman= new toll();
		System.out.println("URK!9CS1105, Saran Sudheer");
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		System.out.println("Welcome to the tollbooth app");
		System.out.println("Enter 1 for entering paying cars");
		System.out.println("Enter 2 for entering non paying cars");
		System.out.println("Enter 3 for diplaying the total");
		System.out.println("Enter 4 Exit");
		while(flag==true) {
			int n = scan.nextInt();
			if(n==1) {
				tollman.pay();
				System.out.println("Done");				
			}
			if(n==2) {
				tollman.nonpay();
				System.out.println("N Done");				
			}
			if(n==3) {
				tollman.dis_p();
				System.out.println("Paid cars= "+tollman.dis_p());
				System.out.println("Total cash paid= "+(tollman.dis_p()*0.5)+" cents");
				System.out.println("Unpaid cars="+tollman.dis_np());
				System.out.println("Total loss="+(tollman.dis_np()*0.5)+" cents");
				
			}
			if(n==4) {
				System.out.println("Thank you");
				flag=false;								
			}
		}
		scan.close();

	}

}
