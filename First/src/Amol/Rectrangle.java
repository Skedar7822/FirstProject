package Amol;
import java.util.Scanner;

public class Rectrangle {
        
	int result;
	  static void Area_of_rectrangle(int ln,int wi) {
		  Rectrangle r1=new Rectrangle();
		  int len=ln;
		  int width=wi;
		  r1.result=len*width;
		  System.out.println("This is a Area Of Rectrangle------->"+r1.result);
		  
		  
		  
	  }
	  static void Perimeter(int a,int b)
	  {
		  System.out.println("This is A Perimeter of Rectrangle----->"+(a+b+a+b));
		  
	  }
	  
	  
	  public static void main(String[] args)
	  { 
		  Scanner Sc=new Scanner(System.in);
		  
		  int a,b;
		  System.out.println("Enter A Length Of Rectrangle");
		  a=Sc.nextInt();
		  System.out.println("Enter A width Of Rectrangle");
          b=Sc.nextInt();
          
		  Rectrangle.Area_of_rectrangle(a,b);
		  Rectrangle. Perimeter(10,20);
		  
	  }
}
