package Amol;

public class Employee {
	
	double da;
	double hra;
	double ta;
	double pt;
	double pf;
	double Salary=550000;
	double gross_salary;
	double net_salary;
	
	void DA(Double DA)
	{
		da=Salary*DA/100;
		System.out.println("DA Salary Is=  "+da);
	}
	void Hra(Double hra)
	{
		hra=Salary*hra/100;
		System.out.println("Hra Salary Is=  "+hra);

	}
 
	void Ta(Double Ta)
	{
		ta=Salary*Ta/100;
		System.out.println("Ta Salary Is=  "+ta);

	}

	
	void Pt(Double Pt)
	{
		pt=Pt;
		System.out.println("Pt Salary Is=  "+pt);

	}

	void Pf(Double Pf)
	{
		pf=Salary*Pf/100;
		System.out.println("Pf Salary Is=  "+pf);

	}

	void Gross_Salary()
	{
		gross_salary=Salary+da+hra+ta;
		System.out.println("gross_salary Is=  "+gross_salary);
	}
	void Net_Salary()
	{
		net_salary=gross_salary-(pf+ta);
		System.out.println("net_salary Is=  "+net_salary);
		
		System.out.println("--------------------------Thank You -------------------------");
	}


}
