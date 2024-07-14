 abstract class demo
 {
 }
 abstract void payment();
 class wallet extends demo{
 void payment() 
{
 System.out.println("Wallet payment success");
 }
 }
 class netbanking extends demo{
 void payment()
 {
 System.out.println("Netbanking payment success");
 }
 }
class AbstractionExaomple1.java
 { 
public static void main(String args[])
 {  
wallet w=new wallet();
 w.payment();
 netbanking n=new netbanking();
 n.payment();
 }  
}
