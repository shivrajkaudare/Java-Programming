// ForEach Method in java.
import java.util.ArrayList;  
import java.util.List;  
public class ForEachExample {  
    public static void main(String[] args) {  
        List<string> l1 = new ArrayList<string>(); // Creating a new ArrayList to store games  
        // Adding games to the list  
        l1.add("Football");  
        l1.add("Cricket");  
        l1.add("Chess");  
        l1.add("Hockey");  
      
        // Iterating over the list using forEach and printing each element using a lambda expression  
        l1.forEach(game -> System.out.println(game));  
    }  
}  
