package JavaClass;

class Student{
	int id;
	String name;

	public void inputes(int id, String name) {		
		this.id = id;
		this.name = name;
		
	}
}

public class JavaClass {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		s1.id = 101;
		s1.name = "Shiv";
		System.out.println("Student id "+ s1.id +" Student name " + s1.name);

	}

}
