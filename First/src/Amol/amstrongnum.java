package Amol;

import java.util.Scanner;

public class amstrongnum {
public static void m1()
{
	      Scanner Sc=new Scanner(System.in);
	      System.out.println("Enter A Number To Check Amstrong Or Not");
	      int number=Sc.nextInt();
	      int temp1=number;
	      int temp2=temp1;
	      int result=0,count=0;
	      while(temp1>0)
	      {
	    	  count++;
	    	  temp1/=10;
	      }
	      
	      while(temp2>0)
	      {
	    	  int res=temp2%10;
	    	  int multi=1;
	    	  for(int i=1;i<=count;i++) {
	    		  multi=multi*res;
	    	  }
	    	  temp2/=10;
	    	  result=result+multi;
	      }
	      if(number==result)
	      {
	    	  System.out.println("Is Amstrong");
	      }else {
	    	  System.out.println("Not Amstrong");
	      }
	      
			
}
public static void main(String[] args) {
	m1();
}
}
