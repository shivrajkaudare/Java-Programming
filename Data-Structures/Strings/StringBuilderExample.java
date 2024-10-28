// StringBuilder() - it is class in java used to create mutable String in java.
//               - it dont have guarantee of synchronization.
//               - not thread safe(can not be shared in multiple threads).
//               - memory efficient and high performance.
//               - it is used when thread safty is not required.

public class StringBuilderExample{
    public static void main(String[] args) {
        
        StringBuilder str = new StringBuilder("H");
            str.append("e");
            str.append("l");
            str.append("l");
            str.append("o");

            System.out.println(str);
    
    
        // Constructors for construct StringBuilder object.
        // 1) StringBuilder()- it construct the String builder with no character in it.initial capacity is 16 characters
        //                   - eg. StringBuilder str = new StringBuilder();

        // 2) StringBuilder(int capacity)- it contruct a StringBuilder with no character in it.
        //                               - eg. StringBuilder str1 = new StringBuilder(10);
        
        // 3) StringBuilder(CharSequence seq)- it construct the StringBuilder with the Specified char sequence.
        //                                   - eg. CharSequence seq = "Hello, CharSequence!";
        //                                         StringBuilder sb1 = new StringBuilder(seq);
        //                                         System.out.println(sb1); 

        // 4) StringBuilder(String) - // it construct the StringBuilder to initialised to the context of the specified String.
        //                          - eg. String str = "Hello, String!";
        //                                  StringBuilder sb2 = new StringBuilder(str);
        //                                  System.out.println(sb2);
    
    }
}
