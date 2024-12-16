// Functional interface - A functional interface is an interface that contains only one abstract method. 
/* @FunctionalInterface annotation is used to ensure that the functional interface can’t have more than one abstract method. 
In case more than one abstract methods are present, the compiler flags an ‘Unexpected @FunctionalInterface annotation’ message.
However, it is not mandatory to use this annotation. */

//functional interface.
@FunctionalInterface
interface Square {
    int calculate(int x);
}

class Test {
    public static void main(String args[])
    {
        int a = 5;

        // lambda expression to define the calculate method
        Square s = (int x) -> x * x;

        // parameter passed and return type must be
        // same as defined in the prototype
        int ans = s.calculate(a);
        System.out.println(ans);
    }
}
