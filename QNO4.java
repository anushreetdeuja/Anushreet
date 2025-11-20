/**
 * Write a description of class DefaultValues here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class QNO4 {
    // Member variables (fields) for all 8 primitive types
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    char c;
    boolean bool;

    public static void main(String[] args) {
        // Create an instance of the class
        QNO4 obj = new QNO4();

        // Print the default values of each field
        System.out.println("byte default: " + obj.b);
        System.out.println("short default: " + obj.s);
        System.out.println("int default: " + obj.i);
        System.out.println("long default: " + obj.l);
        System.out.println("float default: " + obj.f);
        System.out.println("double default: " + obj.d);
        System.out.println("char default: '" + obj.c + "'");
        System.out.println("boolean default: " + obj.bool);
    }
}