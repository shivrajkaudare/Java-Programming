package Pattern_Printing;

// Output - 00000000010
//          000000009
//          00000008
//          0000007
//          000006
//          00005
//          0004
//          003
//          02
//          1


public class DecrementingNumericPyramid {

    public static void main(String[] args) {
        
        int n = 10;
        
        for(int i = 0; i < n; i++) {
            
            // Printing leading zeros
            for(int j = 0; j < n-i-1; j++) {
                System.out.print(0);
            }
            
            // Handling the case for the first number to print 10 instead of just 9
            if (i == 0) {
                System.out.println(10);
            } else {
                System.out.println(n-i);
            }
        }
    }
}
