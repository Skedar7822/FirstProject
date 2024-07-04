package Amol;

public class Emp_info {
	String Emp_Name;
	String Emp_Add;
	String Emp_Dob;
	String Emp_Mo;
	int Emp_Id;
	int Emp_Salary;

	void Asign(String n,String Add,String Dob,String Mo,int Id,int Sal)
	{
		Emp_Name=n;
		Emp_Add=Add;
		Emp_Dob=Dob;
		Emp_Mo=Mo;
		Emp_Id=Id;
		Emp_Salary=Sal;
		
				
	}
	void Display() {
		System.out.println("Employee Name Is :"+Emp_Name);
		System.out.println("Employee Address Is :"+Emp_Add);
		System.out.println("Employee Birthady Date Is :"+Emp_Dob);
		System.out.println("Employee Mobile Number Is "+Emp_Mo);
		System.out.println("Employee Id Is : "+Emp_Id);
		System.out.println("Employee Salary Is : "+Emp_Salary);
		
	}
	public static void main(String[] args) {
		Emp_info Emp=new Emp_info();
		Emp.Asign("Amol Kedar", "Mangrul bk,Shevgaon,AhemedNagar,Maharashtra", "05/01/2004", "7822087135", 101, 500000);
		Emp.Display();
	}
}
