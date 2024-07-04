package ConStructor;

import java.util.Scanner;

public class ATMM {

	
	int Acc;
	String Name;
	int Mo;
	int Pin;
	
	ATMM(int A,String N,int mo,int pin)
	{
		Acc=A;
		Name=N;
		Mo=mo;
		Pin=pin;
	}
	
	void Display()
	{
		
		 if (Name==Name)
		 {
			 System.out.println("Hello Sir.... you can Access Your Account");
			 
		 }
		 
	}
	
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter Your Account Number");
		int ACCC=Sc.nextInt();
		System.out.println("Enter Your Name");
		String Na=Sc.next();
		System.out.println("Enter Your Mobile Number");
		int mno=Sc.nextInt();
		System.out.println("Enter Your Atm Pin ");
		int pinn=Sc.nextInt();
		
		ATMM A=new ATMM(ACCC,Na,mno,pinn);
		A.Display();
		
	}
}
