package ConStructor;

import java.util.Scanner;

public class ATM {

	
	String Pname;
	int Acno;
	int pin;
	double Balance;
	
	ATM(String Pname,int Acno,int pin,double Balance){
		this.Pname=Pname;
		this.Acno=Acno;
		this.pin=pin;
		this.Balance=Balance;
		
		
	}
	int Display()
	{
		System.out.println("Person Name Is : "+Pname);
		System.out.println("Person Account no Is : "+Acno);
		System.out.println("Person Pin Is :   XXXXX98");
		System.out.println("Total Balance Is:  "+Balance);
		return 0;
		
		
	}
	double Withdraw(double amount)
	{
		this.Display();
		Balance=Balance-amount;
		return Balance;
	
		
	}
	
	double Diposit(double amount)
	{ this.Withdraw(100.00);
		Balance=Balance+amount;
		return Balance;
	}
	
	
	public static void main(String[] args) {
		System.out.println("-----------------------||||||||||---------------------------");

		Scanner s=new Scanner(System.in);
		System.out.println("Enter Your Name......");
		String Nmm=s.nextLine();
		
		System.out.println("Enter Your Account Number ...");
		int Acc=s.nextInt();
		
		System.out.println("Enter Your Atm Pin ..");
		int pinn=s.nextInt();
		
		System.out.println("Enter Your Balance  !");
		double ball=s.nextDouble();		
		ATM A1=new ATM(Nmm,Acc,pinn,ball);
		
		A1.Display();
		System.out.println("-----------------------||||||||||---------------------------");
		System.out.println("-----------------------||||||||||---------------------------");

		System.out.println("Which Operation Perfom Your Side.....");
		String output=s.next();
		System.out.println("-----------------------||||||||||---------------------------");
		System.out.println("-----------------------||||||||||---------------------------");

		switch(output){
		case "Deposit":
			System.out.println("After Deposit "+A1.Diposit(1000.59));
			  break;
		case "With":
			System.out.println("After Withdrol "+A1.Withdraw(2000.59));
             break;
			
		}
		
	
		
		
		
	}
}

//ATM A2=new ATM("Vishal Kedar",22087449,2209,4000.33);
//ATM A3=new ATM("Ram Rathod",22087449,2209,4000.33);
//A1.Display();
//System.out.println("After Withdrol "+A1.Withdraw(2000.59));
//System.out.println("After Deposit "+A1.Diposit(1000.59));
//System.out.println("-----------------------");
//
//A2.Display();
//System.out.println("After Withdrol "+A2.Withdraw(1000.59));
//System.out.println("After Deposit "+A2.Diposit(1000.59));
//System.out.println("-----------------------");


//System.out.println("Enter WithDroll Amount ");
//double with=s.nextDouble();	
//System.out.println("Total Balance: "+A1.Withdraw(with));
//
//System.out.println("-----------------------||||||||||---------------------------");
//

//System.out.println("Enter Deposit Amount ");
//double depo=s.nextDouble();
//	System.out.println("Total Balance "+A1.Diposit(depo));
//System.out.println("                                                ");
//System.out.println("                                                ");