package Amol;
import java.util.Scanner;
public class Febonnacipratic4 {

	
	  public static void m1()
	  {
		  Scanner Sc=new Scanner(System.in);
		  System.out.println("Enter A number to print febonannci searice");
		  int no=Sc.nextInt();
		  int ft=0;
		  int st=1;
		  int tt=0;
		  for(int i=0;i<=no;i++) {
			  System.out.println(tt);
			  
			  tt=ft+st; 
			  ft=st;
			  st=tt;
			  
		  }
	  }
	  public static void main(String[] args) {
		  m1();
	  }
}
