// it is used to reuse the constructor.
class demo
{
 demo()
  {
      System.out.println("I am demo constructor");
  } 

 demo(int a)
  {
     this();
     System.out.println("A="+a);
  } 
  
class sample { 
  public static void main(String args[]) { 
     demo d=new demo(10); 
  } 
}
