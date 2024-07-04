package Amol;

public class My_Info {

	String My_name;
	String My_blod_grup;
	int My_Phone_No;
	String Add;
	int Age;
	
	void asign_value(String n,String Bg,String add,int Mo,int age) {
		My_name=n;
		My_blod_grup=Bg;
		My_Phone_No=Mo;
		Add=add;
		Age=age;
	}
	void Display() {
		System.out.println("My Name Is :"+My_name);
		System.out.println("My Blod Grup IS "+My_blod_grup);
		System.out.println("My Mobile Number Is:"+My_Phone_No);
		System.out.println("My Address Is :"+Add);
		System.out.println("My Age IS :"+Age);
	}
}
