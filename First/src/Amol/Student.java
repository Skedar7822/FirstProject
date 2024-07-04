package Amol;

public class Student {

	
	int s1;
	int s2;
	int s3;
	int s4;
	int s5;
	int marks;
	double result;
	
	
	void Total( int m1,int m2,int m3,int m4,int m5)
	{
		s1=m1;
		s2=m2;
		s3=m3;
		s4=m4;
		s5=m5;
		marks=s1+s2+s3+s4+s5;
		System.out.println("Total marks Is ="+marks);
		
	}
	void pre()
	{
		result=marks/5;
		System.out.println("Total Persentage ="+result);
		
	}
}

