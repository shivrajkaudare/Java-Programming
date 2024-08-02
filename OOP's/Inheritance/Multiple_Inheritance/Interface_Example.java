// There can be only abstract methods in the Java interface, not method body.
// Used to achieve abstraction and multiple inheritance
// Java Interface also represents the IS-A relationship.
//  By interface, we can support the functionality of multiple inheritance.

 interfacetest
 {
 voidpayment();
 }
 classsampleimplementstest
 {
 publicvoidpayment()
 {
 System.out.println(“Net banking");
 }
 publicstaticvoidmain(Stringargs[])
 {
 samples=newsample();
 s.payment();
 }
