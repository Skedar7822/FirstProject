package Amol;

import java.util.Scanner;

public class EmployeeMain {
public static void main(String[] args) {
	Employee E=new Employee();
	Scanner Sc=new Scanner(System.in);
	
	System.out.println("Enter A Da Salary....");
	double da=Sc.nextDouble();
	
	System.out.println("Enter A Hra Salary....");
	double hra=Sc.nextDouble();
	
	System.out.println("Enter A Ta Salary....");
	double ta=Sc.nextDouble();
	
	System.out.println("Enter A Pt Salary....");
	double pt=Sc.nextDouble();
	
	System.out.println("Enter A Pf Salary....");
	double pf=Sc.nextDouble();
	
	
	E.DA(da);
	E.Hra(hra);
	E.Ta(ta);
	E.Pt(pt);
	E.Pf(pf);
	E.Gross_Salary();
	E.Net_Salary();
}


}
