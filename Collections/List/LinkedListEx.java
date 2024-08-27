
// LinkedList -
// - it can Contain Duplicate elements.
// - sequential access, so it is slower to accessing the elements compare to ArrayList.
// - insertion and deletion of elements is faster.
// - LinkedLis's are Synchronized.
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEX{

	public static void main(String[] args) {
		
		LinkedList<String> li = new LinkedList<String>();
		
		    li.add("Shiv");
		    li.add("Raj");
		    li.add("Shivraj");
		    li.add("Deepak");
		    
		   System.out.println(li);
		
	}

}

