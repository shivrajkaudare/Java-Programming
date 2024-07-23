// Used to invoke parent class method
// It should be used if subclass contains the same method as parent class.
// It is used if method is overridden

 class demo
 {
 void show()
 {
 System.out.println("Super class method");
 }
 }
 class sample extends demo{
 void show()
 {
 super.show();
 System.out.println("Sub class method");
 } 
public static void main(String args[]) {  
sample s1 = new sample();
 s1.show();
 }  
} 
