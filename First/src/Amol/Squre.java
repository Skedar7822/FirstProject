package Amol;

public class Squre {

	
	String Name="Squre";
	String Color="Blue";
	int Res;
	
	static void area(int s) {
		Squre s1=new Squre();
		s1.Res=s*s;
		System.out.println("Area Is =:"+s1.Res);
		
	}
	static void display()
	{
		Squre s1=new Squre();
		System.out.println(s1.Name);
		System.out.println(s1.Color);

		
	}
	
	
}
