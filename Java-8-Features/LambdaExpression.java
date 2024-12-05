// Lambda expression.
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(5);
    numbers.add(9);
    numbers.add(8);
    numbers.add(1);
    // print the Array list using lambda expression.
    numbers.forEach( (n) -> { System.out.println(n); } );
  }
}
