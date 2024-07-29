// If you make any method as final, you cannot override it.
 class Parent {  
   final void display() {
         System.out.println("final method");
   }  
 }
 public class sampleextends Parent {
   void display() {
        System.out.println("final method");
   } 
 public static void main(String[] args) {
       sample s=new sample();  
       s.display();
  }
 }
