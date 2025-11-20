/**
 * GradeEvaluator.java
 * Question 2: Grade Evaluator
 * Demonstrates use of ternary operator and escape sequences.
 *
 * @author (your name)
 * @version (a version number or date)
 */

import java.util.Scanner;

public class QNO2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take numeric grade as input
        System.out.print("Enter your grade: ");
        int grade = sc.nextInt();

        // Use ternary operator to assign Pass/Fail
        String result = (grade >= 40) ? "Pass" : "Fail";

        // Format output using escape sequences
        System.out.println("\n\t*** Grade Evaluation Result ***");
        System.out.println("\tGrade Entered: " + grade);
        System.out.println("\tStatus: " + result + "\n");
    }
}