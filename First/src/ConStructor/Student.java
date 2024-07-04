package ConStructor;

public class Student {

	String Name;
	int id;
	String std;
	double sub1;
	double sub2;
	double sub3;
	double mark;
	double per;
	
	Student(String n,int Id,String Std,double s1,double s2,double s3 ){
		Name=n;
		id=Id;
		std=Std;
		sub1=s1;
		sub2=s2;
		sub3=s3;
		
	}
	
	int total()
	{
		mark=sub1+sub2+sub3;
		System.out.println("Student Name Is"+Name);
		System.out.println("Student Name Id"+id);
		System.out.println("Student Name Std"+std);

		System.out.println("Total Marks Is = "+mark);
		
		return 0;
	}
	int per()
	{
		per=mark/3;
		System.out.println("ToTal Per is = "+per);
		
		System.out.println("---------------------------------------------");

		return 0;
		
	}
	
}
