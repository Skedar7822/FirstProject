package Amol;

public class Employe {

	double da;
	double hra;
	double ta;
	double pt;
	double pf;
	double salary=40000;
	double Gross_Sallary;
	double net_Salary;
	
	void da()
	{
		da=salary*10/100;
		System.out.println(da);
		
		
	}
	void hra()
	{
		hra=salary*15/100;
		System.out.println(hra);
		
		
	}
	void ta()
	{
		ta=salary*20/100;
		System.out.println(hra);
		
		
	}
	void pt()
	{
		pt=salary*15/100;
		System.out.println(hra);
		
		
	}
	void pf()
	{
		pf=salary*10/100;
		System.out.println(hra);
		
		
	}
	void Create_gross_salary() {
		Gross_Sallary=salary+da+hra+ta;
		System.out.println("Gross_Sallary->"+Gross_Sallary);
		
	}
    void Create_net_salary() {
    	net_Salary=Gross_Sallary-(pf+pt);
    	System.out.println("net_Salary->"+net_Salary);
		
    }
	
	
}
