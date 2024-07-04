package Amol;

public class Calculator {
	
	
	int num1;
	float num2;
	double num3;
	static void Add(int n1,float n2,double n3) {
		Calculator c1=new Calculator();
		c1.num1=n1;
		c1.num2=n2;
		c1.num3=n3;
		System.out.println("Addtion is:"+(c1.num1+c1.num2+c1.num3));
	}
	
	 static void Sub(int n1,float n2,double n3) {
		Calculator c1=new Calculator();
		c1.num1=n1;
		c1.num2=n2;
		c1.num3=n3;
		System.out.println("Subtraction is:"+(c1.num1-c1.num2-c1.num3));
	}
	
	
	 static void Multi(int n1,float n2,double n3) {
		Calculator c1=new Calculator();
		c1.num1=n1;
		c1.num2=n2;
		c1.num3=n3;
		System.out.println("Multiplication  is:"+(c1.num1*c1.num2*c1.num3));
	}
	
	
	 static void Div(int n1,float n2,double n3) {
		Calculator c1=new Calculator();
		c1.num1=n1;
		c1.num2=n2;
		c1.num3=n3;
		System.out.println("Division  is:"+(c1.num1/c1.num2/c1.num3));
	}

	

}
