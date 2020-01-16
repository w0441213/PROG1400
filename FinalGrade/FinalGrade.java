package FinalGrade;

import java.util.Scanner;

public class FinalGrade {

    // Write a program that asks the user to enter three test scores.
    // The program should display each test score, as well as the average of the scores.

    public static void main(String[] args) {

        // grade variables
        float assignment1;
        float assignment2;
        float assignment3;
        float assignment4;
        float assignment5;
        float assignment6;

        Scanner s = new Scanner(System.in);

        System.out.print("Enter grade for assignment 1: " );
        assignment1 = s.nextFloat();
        System.out.print("Enter grade for assignment 2: " );
        assignment2 = s.nextFloat();
        System.out.print("Enter grade for assignment 3: " );
        assignment3 = s.nextFloat();
        System.out.print("Enter grade for assignment 4: " );
        assignment4 = s.nextFloat();
        System.out.print("Enter grade for assignment 5: " );
        assignment5 = s.nextFloat();
        System.out.print("Enter grade for assignment 6: " );
        assignment6 = s.nextFloat();

        float finalGrade =
                (assignment1 + assignment2 + assignment3 + assignment4 + assignment5 /* + assignment6 */) / 5;
        System.out.println("Your final grade is: " + finalGrade);


    }
}
