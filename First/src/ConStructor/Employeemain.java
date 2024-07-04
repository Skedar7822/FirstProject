package ConStructor;

import java.util.Scanner;

public class Employeemain {
	public static void main(String[] args) {
		
//		Scanner Sc=new Scanner(System.in);
//		System.out.println("Enter a employee name");
//		String n=Sc.nextLine();
//		
//		System.out.println("Enter A Emp Id");
//		int idd=Sc.nextInt();
//		System.out.println("Enter A  Emp mobile number");
//		int mon=Sc.nextInt();
		
		Employee E1=new Employee("Amol ",22,782208700);
		Employee E2=new Employee("Ram ",44,444444444);
		Employee E3=new Employee("krishna",21,333333334);

		E1.display();
		E2.display();
		E3.display();
		}

}
