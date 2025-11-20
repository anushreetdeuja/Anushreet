/**
 * DataTypeInspector.java
 * Demonstrates Java's 8 primitive data types.
 *
 * @author (your name)
 * @version (a version number or date)
 */
public class DataTypeInspector {
    public static void main(String[] args) {
        // 1. byte (8-bit signed integer)
        byte b = 100;

        // 2. short (16-bit signed integer)
        short s = 20000;

        // 3. int (32-bit signed integer)
        int i = 123456;

        // 4. long (64-bit signed integer, requires 'L' suffix)
        long l = 9876543210L;

        // 5. float (32-bit floating point, requires 'f' suffix)
        float f = 3.14f;

        // 6. double (64-bit floating point)
        double d = 2.718281828;

        // 7. char (16-bit Unicode character, single quotes)
        char c = 'A';

        // 8. boolean (true/false)
        boolean bool = true;

        // Print values with descriptive labels
        System.out.println("byte value: " + b);
        System.out.println("short value: " + s);
        System.out.println("int value: " + i);
        System.out.println("long value: " + l);
        System.out.println("float value: " + f);
        System.out.println("double value: " + d);
        System.out.println("char value: " + c);
        System.out.println("boolean value: " + bool);
    }
}