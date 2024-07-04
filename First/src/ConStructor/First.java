package ConStructor;

import java.util.Scanner;

public class First {

	
	int a;
	int b;
	
	First(int A,int B)
	{
		System.out.println(A+B);
	}
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter A 2 Number");
		
		int a=Sc.nextInt();
		int b=Sc.nextInt();
		First f1=new First(a,b);
	}
}
