package Amol;

import java.util.Scanner;

public class Area {

	double area;
       int R;
	
	static void area(int r)
	{
		Area A=new Area();
		A.R=r;
		A.area=3.14*A.R*A.R;
		System.out.println("Area  Of Circle Of: "+A.area);
		
	}
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter A Value");
		int a=Sc.nextInt();
		Area.area(a);
		
	}
}
