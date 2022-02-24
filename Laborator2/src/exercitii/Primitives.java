package exercitii;

//defining class
public class Primitives {
    //atribute
    public static int publicValue = 10;
    private static int privatevalue;
    static int  defaultValue;
    protected static int protectedValue;
    /*
        Java Primitives
        byte  - wrappers Byte
        short  Short
        int   Integer
        long Long
        float -  floating point  Float
        double - floating point
        boolean Boolean
        char  Character
     */
    public static void main(String[] args) {
        byte byteNumber = 10;
        System.out.println("byte number is:" + byteNumber);

        int intNumber = 10;
        System.out.println("int number is:" + intNumber);

        float floatNumber = 10.54F;
        System.out.println("float number is:" + floatNumber);

        double doubleNumber = 4.5;
        System.out.println("double number is:" + doubleNumber);

        char charValue;
        charValue = 'c';
        System.out.println("char value is:" + charValue);

        charValue = '\u2345';
        System.out.println("char value from unicode is:" + charValue);

        boolean boolValue = false;

        System.out.println("bool value is:" + boolValue);

        System.out.println("private value is:" + privatevalue);
    }

}
