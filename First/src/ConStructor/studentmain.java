package ConStructor;

public class studentmain {

	public static void main(String[] args) {
		
		Student s1=new Student("Amol",101,"12th",50.55,66.9,54.66);
		Student s2=new Student("Ram",102,"11th",60.55,76.9,84.66);
		Student s3=new Student("Vishal",101,"9th",40.55,36.9,94.66);
		s1.total();
		s1.per();
		
		s2.total();
		s2.per();
		
		s3.total();
		s3.per();

	}
}
