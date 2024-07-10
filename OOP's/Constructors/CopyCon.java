package Constructors;

class Sample{
	int id ;
	String name;
	int age;
	int marks;
	public Sample(int id, String name) {
		this.id = id;
		this.name = name;	
	}
	
	public Sample(Sample s, int age, int marks) {
		 id = s.id;
		 name = s.name;
		 this.age = age;
		 this.marks = marks;	
	}
	
	void show() {
		System.out.println( id + " having name " + name + " and his age "+ age +" and his obtained marks are " + marks);
	}
}
public class CopyCon {

	public static void main(String[] args) {
		
          Sample s1 = new Sample(101, "Shivraj");
         
          Sample s2 = new Sample(s1, 23, 86);
          s2.show();
	}

}

