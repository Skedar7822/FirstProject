package MethodEx;

import java.util.Scanner;

public class Bridthmain {

	public static void main(String[] args)
	{
		
		Bridges B1=new Bridges();
		Scanner Sc=new Scanner(System.in);
		
		
		System.out.println("Enter A First Id");
		int A1=Sc.nextInt();
		
		System.out.println("Enter A Second Id");
		int A2=Sc.nextInt();
		
		System.out.println("Enter A Third Id");
		int A3=Sc.nextInt();
		
		System.out.println("Enter A fourth Id");
		int A4=Sc.nextInt();
		
		System.out.println("Enter A five Id");
		int A5=Sc.nextInt();
		
		
		System.out.println("Enter A First Bridge Name ");
		String B11=Sc.next();
		
		System.out.println("Enter A Second Bridge Name ");
		String B2=Sc.next();
		
		System.out.println("Enter A Third  Bridge Name ");
		String B3=Sc.next();
		
		System.out.println("Enter A Fourth  Bridge Name ");
		String B4=Sc.next();
		
		System.out.println("Enter AFive  Bridge Name ");
		String B5=Sc.next();
		
		
		
		System.out.println("Enter A First Bridge Length  ");
		int c1=Sc.nextInt();
		
		System.out.println("Enter A Second Bridge Length");
		int c2=Sc.nextInt();
		
		System.out.println("Enter A Third Bridge Length");
		int c3=Sc.nextInt();
		
		System.out.println("Enter A Fourth Bridge Length");
		int c4=Sc.nextInt();
		
		System.out.println("Enter A Five Bridge Length");
		int c5=Sc.nextInt();
		
		
		B1.Display_id(A1, A2, A3, A4, A5);
		B1.Display_Name(B11, B2, B3, B4, B5);
		B1.Display_leangth(c5, c2, c3, c4, c5);
		
		
			
		
	}
}
