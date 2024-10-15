import java.util.Scanner;
public class StringReverse {
    public static void main(String [] args){
          
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a String  : ");
           String str = sc.next();
       
        char arr [] = str.toCharArray();

        String newStr = "";

          for(int i = arr.length-1; i >=0; i--){
                  newStr += arr[i];
          }

          System.out.println("Reverse String is  :"+newStr);
    }
}