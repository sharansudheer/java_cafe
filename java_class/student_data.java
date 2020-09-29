package java_class;
/*
 For each student maintain 5 subject details as

18CS2015- OBJECT ORIENTED PROGRAMMING LAB

subjectName, subjectCode,mark,grade. Calculate the grade for each
subject based on the mark.
 In the menu give the user options to add, edit, delete or display the
student grade details */

import java.util.Scanner;
class student{
	String name;
	String registerno;
	String department;
	String specialization;
	int sem;

	int [] marks;
	String grade;
	
	student(){
		registerno="Null";
		department="Null";
		specialization="Null";
		sem=1;
	}
	student(String d, String a, String b, String c, int s ){
		name=d;
		registerno=a;
		department=b;
		specialization=c;
		sem=s;
	}
	void student_addmarks(int a){
		for(int i=0; i<5; i++) {
			marks[i]=a;
		}
	}
	void student_dismarks() {
		for(int i=0; i<5; i++) {
			if(marks[i]<101 && marks[i]>90) {
				System.out.println(marks[i]+" Grade"+" = A");
			}else if(marks[i]<91 && marks[i]>79) {
				System.out.println(marks[i]+" Grade"+" = A");
			}
			else if(marks[i]<81 && marks[i]>69) {
				System.out.println(marks[i]+" Grade"+" = A");
			}
			else if(marks[i]<100 && marks[i]>89) {
				System.out.println(marks[i]+" Grade"+" = A");
			}
			else {
				System.out.println(marks[i]+" Grade"+" = E");
			}
		}		
	}
	void disp() {
		System.out.println("Name= "+name);
		System.out.println("Register number= "+registerno);
		System.out.println("Semester "+sem);
		System.out.println("Department= "+department);
		System.out.println("Specialization= "+specialization);
		
		
	}
	
}
public class student_data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);		
		int n=scan.nextInt();
		boolean flag = true;
		while(flag==true) {
			student[] admin = new student[n];
			System.out.println("Enter a digit from the options");
			System.out.println("1. Add a student");
			System.out.println("2. Edit a student");
			System.out.println("3. Delete");
			System.out.println("4. Display all student details");
			System.out.println("5. Exit");
			int m=scan.nextInt();
			switch(m) {
			case 1:
				
				String name=scan.nextLine();
				String regisno=scan.nextLine();
				String dept=scan.nextLine();
				String spez=scan.nextLine();
				int sem=scan.nextInt();	
				int j=0;
				admin[j]= new student(name,regisno,dept,spez,sem);
				j++;
				int a;
				for(int k=0; j<5; j++) {
					a=scan.nextInt();
					admin[k].student_addmarks(a);
				}
			case 4:
				for(int i=0; i<n; i++) {
					admin[i].disp();
					admin[i].student_dismarks();
				}
				
			case 5:
				flag=false;
			}
				
		}
		scan.close();

	}

}
