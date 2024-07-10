package OOPs;

class Parent {
	
	void show() {
		
		System.out.println("This is parnet class");
	}
}
class Child extends Parent{
	void show2() {
		super.show();
		System.out.println("this is child class");
	}
}
public class Inheritance {

	public static void main(String[] args) {
		
		Child c1 = new Child();
		c1.show2();
		

	}

}
