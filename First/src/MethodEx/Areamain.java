package MethodEx;

public class Areamain {

	public static void main(String[] args) {
		
		
		AreausingReturn a1=new AreausingReturn();
		int ressq=a1.Squre(22);
		int resrs=a1.rectrangle(20, 50);
		float restr=a1.trangle(33.3f, 24.4f);
		
		System.out.println("Area of Squre "+ressq);
		System.out.println("Area of rectrangle "+resrs);
		System.out.println("Area of Trangle "+restr);


	}

}
