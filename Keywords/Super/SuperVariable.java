// Access the data member or field of parent class.
// It is used if parent class and child class have same fields.

class Demo {
  String name = "Shivraj";
}
class Sample extends demo {
  String sirname = "Kaudare";
  void show() {
    System.out.println("Name = "+ super.name);
     System.out.println("Sirname = "+ super.sirname);
  }
}
public class SuperVariable{
public static void main (String [] args){
  Sample s1 = new Sample();
  s1.show();
}
}
