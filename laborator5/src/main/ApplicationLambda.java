package main;

import lmbda.MyFunction;

public class ApplicationLambda {
    public static void main(String[] args) {

        /*MyFunction  funct = (int a, int b) -> {
            return a+b;
        };

        System.out.println(funct.apply(10, 20));*/

     testFunct((a,b) -> a+b);
     testFunct((a,b) -> a*b);
    }

    public static void testFunct(MyFunction f) {
        System.out.println(f.apply(10, 20));
    }
}
