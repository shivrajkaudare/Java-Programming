// Stack is class in java collection which implements vector interface.
// Stack is DataStructure that follows LIFO algorithm for adding and removing elements(Push and Pop).
// Stack can be implemented by in three ways :
//           1) Using Array
//           2) Using ArrayList
//           3) Using LinkedList
//      here LinkedList and ArrayList are convinient way for implementation of Stack.

package Collections.Stack;
import java.util.Stack;


public class StackEx {

    public static void main(String[] args) {
        
        Stack<Integer> s1 = new Stack<Integer>();

        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        
    //    System.out.println(s1);

        for(Integer i : s1){
            System.out.println(i);
        }
        
        // Pop- remove the last / topmost element.
        s1.pop();
        System.out.println("Stack after removing top most element :");
        for(Integer i : s1){
            System.out.println(i);
        }

        // find head / peek element.
        System.out.println("Peek element of stack is : "+ s1.peek());
    }
    
}
