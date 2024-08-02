// There can be only abstract methods in the Java interface, not method body.
// Used to achieve abstraction and multiple inheritance
// Java Interface also represents the IS-A relationship.
//  By interface, we can support the functionality of multiple inheritance.

 interface test {
   void payment();
 }

class sample implements test {
 public void payment() {
   System.out.println("Net banking");
 }
}
 public class Interface_Example {
   public static void main(String args[]) {
 sample s =new sample();
 s.payment();
 }
}
