package Constructors;

public class paramatrizedCon {

    String input;
	public paramatrizedCon( String input) {
		this.input = input;
		System.out.println(input);
		
	}
	public static void main(String[] args) {
		
		paramatrizedCon p1 = new paramatrizedCon("This is an Parametriesed Constructor");
		
	}

}
