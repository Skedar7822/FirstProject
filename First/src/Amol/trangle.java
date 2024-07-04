package Amol;
import java.util.Scanner;
public class trangle {
   int A,B,C,sp,res;
   static void Semipara(int a,int b,int c)
   { 
	   trangle t=new trangle();
	  t.A=a;
	   t.B=b;
	  t. C=c;
	   t.sp=(t.A+t.B+t.C)/2;
	   System.out.println("Piryameter Is :"+t.sp);
	   
	   t.res=(int) Math.sqrt(t.sp*(t.sp-t.A)*(t.sp-t.B)*(t.sp-t.C));
	   System.out.println("Area Of Trangle :"+t.res);
   }
   
   

   
}
