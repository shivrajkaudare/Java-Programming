// If you don't use the this keyword, compiler automatically adds this keyword while invoking the method.
class demo {
  void method1() {
        System.out.println("I am method 1");
  } 
  void method2() {
        System.out.println("I am method 2");
        this.method1();
  } 
}
class sample { 
public static void main(String args[]) { 
     demo d=new demo(); 
     d.method2();
  } 

}
