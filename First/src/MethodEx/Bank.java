package MethodEx;

public class Bank {
   void DisplayBranch()
  {
	  System.out.println("pune");
	  System.out.println("Shevgaon");
	  System.out.println("Mangrul Bk");
	  
  }
  void DisplayIFSc()
  {
	  System.out.println("Pu2033");
	  System.out.println("she4477");
	  System.out.println("Man7733");
  }
  static void DisplayBN()
  { Bank b1=new Bank();
	  
	 b1. DisplayBranch();
	  b1.DisplayIFSc();
	  System.out.println("HDFC");
	  System.out.println("SBI");
	  System.out.println("Maharashtra Bank");
  }
}
