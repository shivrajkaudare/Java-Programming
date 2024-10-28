// StringBuffer() - it is class in java that represents mutable sequence of character(String).
//                - it allow us to modify content of string without creating object every time.
//                - thread safe can be shared in multiple threads.
//                - it is used when thread safty is required.
//                - it is synchronised so low performance.
//                - append() - use to instert character at the end of the String buffer.
//                - insert() - insert the character at the specified posistion.
//                - delete() - used tp remove character from the buffer.
//                - reverse() - used to reverse order of the characters in the buffer.
public class StringBufferExample{
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Hello");
                str.append(" ");
                str.append("MY");
                str.append(" ");
                str.append("is");
                str.append(" ");
                str.append("Shivraj");

                System.out.println(str);
    }
}