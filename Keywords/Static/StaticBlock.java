 // Is used to initialize the static data member or initialised static fiels in java.
//  It is executed before the main method at the time of classloading.

class demo {
  static
  {
    System.out.println("This is an Static block"); 
  }
  public void display(){
    System.out.println("Display Method");
  }
}

public static void main (String [] args){

  demo d1 = new demo();
  d1.display();
}
