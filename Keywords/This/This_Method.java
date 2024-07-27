//The this keyword can be used to refer current class instance variable.

class sample{ 
         int id;
         String name; 

  sample(int id, String name) {
         this.id = id; 
         this.name = name; 
     }

  void show() {

         System.out.println("Id="+id);
         System.out.println("Name="+name);
    }
class This_Method { 
public static void main(String args[]) { 

         demo d=new demo(); 
         d.method2();
  } 
} 

