/**
 * MathOperations.java
 * Demonstrates all major operator types in Java:
 * 1. Arithmetic
 * 2. Unary (post-increment and pre-increment)
 * 3. Assignment
 * 4. Relational
 * 5. Logical
 * 6. Ternary
 *
 * @author (your name)
 * @version (a version number or date)
 */
public class QNO1 {
    public static void main(String[] args) {
        int a = 10, b = 5;

        // 1. Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // 2. Unary Operators (pre-increment and post-increment)
        System.out.println("\nUnary Operators:");
        int x = 5;
        System.out.println("x = " + x);
        System.out.println("Post-increment x++ = " + (x++)); // prints 5, then x becomes 6
        System.out.println("After post-increment, x = " + x);
        System.out.println("Pre-increment ++x = " + (++x)); // increments first, prints 7

        // 3. Assignment Operators
        System.out.println("\nAssignment Operators:");
        int y = 10;
        System.out.println("y = " + y);
        y += 5; // y = y + 5
        System.out.println("y += 5 → " + y);
        y -= 3; // y = y - 3
        System.out.println("y -= 3 → " + y);
        y *= 2; // y = y * 2
        System.out.println("y *= 2 → " + y);
        y /= 4; // y = y / 4
        System.out.println("y /= 4 → " + y);
        y %= 3; // y = y % 3
        System.out.println("y %= 3 → " + y);

        // 4. Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a == b → " + (a == b));
        System.out.println("a != b → " + (a != b));
        System.out.println("a > b → " + (a > b));
        System.out.println("a < b → " + (a < b));
        System.out.println("a >= b → " + (a >= b));
        System.out.println("a <= b → " + (a <= b));

        // 5. Logical Operators
        System.out.println("\nLogical Operators:");
        boolean p = true, q = false;
        System.out.println("p && q → " + (p && q)); // AND
        System.out.println("p || q → " + (p || q)); // OR
        System.out.println("!p → " + (!p));         // NOT

        // 6. Ternary Operator
        System.out.println("\nTernary Operator:");
        int num = -10;
        String result = (num > 0) ? "Positive" : "Negative";
        System.out.println("num = " + num + " → " + result);
    }
}