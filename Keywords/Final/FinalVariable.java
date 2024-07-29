// If you make any variable as final, you cannot change the value of final variable(It will be constant)
 public class sample {
    final inta=10;//final variable  
    void display() {  
      a=20;  //error
    }  
public static void main(String[] args) {
    sample s=new sample();  
    s.display();
  }
 }

