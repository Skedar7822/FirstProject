package ConStructor;

public class Employee {
	
	
	String Emp_name;
	int id;
	int mo;
	
	Employee(String n,int Id,int mn){
		
		Emp_name=n;
		id=Id;
		mo=mn;
	
	}
	void display()
	{
		System.out.println("Employee Name IS "+Emp_name);
	    System.out.println("Employee Id Is "+id);
	    System.out.println("Employee Mobile Number is "+mo);
	}
	
	

}
