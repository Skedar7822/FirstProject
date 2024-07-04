package Amol;

public class vehical {
	
	String Name;
	String Brand;
	String Color;
	int price;
	
	
	public static void Display_Name(String n) {
		vehical v1=new vehical();
		v1.Name=n;
		System.out.println("Name Is =:"+v1.Name);
		
		
	}
	public static void Display_brand(String b) {
		vehical v1=new vehical();
		v1.Brand=b;
		System.out.println("Brand Is =:"+v1.Brand);
		
		
	}
	public static void Display_Color(String c) {
		vehical v1=new vehical();

		v1.Color=c;
		System.out.println("Color Is =:"+v1.Color);
		
		
	}
	public static void Display_Price(int p) {
		vehical v1=new vehical();

		v1.price=p;
		System.out.println("Price Is =:"+v1.price);
		
		
	}
	
	

}
