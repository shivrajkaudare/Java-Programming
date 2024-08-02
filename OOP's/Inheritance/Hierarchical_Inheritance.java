package OOPs;

class College {
	 String Cname = "Dr. DY Patil College Akurdi";

	    public String CollegeData() {
	        return Cname;
	    }
}
class Stud1 extends College{
  public void Stud1Data(String Name){
    System.out.println(" Student Name is : "+ Name);
    System.out.println(" Students College Name is : "+ super.CollegeData());
  }
}
class Stud2 extends College{
  public void Stud2Data(String Name){
	  
    System.out.println(" Student Name is : "+ Name);
    System.out.println(" Students College Name is : "+ super.CollegeData());
  }
}

public class Hierarchical_inheritance{
  public static void main(String [] args){
    Stud1 s1 = new Stud1();
    s1.Stud1Data("Shivraj Kaudare");

    Stud2 s2 = new Stud2();
    s2.Stud2Data("Nikeeta Kaudare");
  }
}
