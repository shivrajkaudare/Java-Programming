// Strings are immutable in java.
// if we want to make changes in String we have to make copy of an existing one or create new one .
// We can create a String using two ways -
//                                         1) Using String literals.
//                                         2) Using New Keyword.

public Class StringEx1{
  public static void main(String args[]){

         // Using String literals. Using String literals memory is created is stack format.
         String str = "Shivraj";
         System.out.print(str);

         // Using New Kyyword. when we use new keyword for create a String every time new memory is created in heap memory.
         String str1 = new String("Kaudare");
         System.out.print(str1);
  }
}

