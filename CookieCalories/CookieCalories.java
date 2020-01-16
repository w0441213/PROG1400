package CookieCalories;

import java.util.Scanner;

public class CookieCalories {
    // A bag of cookies hold 40 cookies.
    // The calorie information on the bag claims
    // that there are 10 servings in the bag and
    // that a serving equals 300 calories.
    // Write a program that lets the user enter the
    // number of cookies he or she actually ate and
    // then reports the number of total calories consumed.

    public static void main(String[] args) {

        // set the variables, NO MAGIC NUMBERS
        int cookiesInABag = 40;
        int servingsInABag = 10;
        int servingCalories = 300;

        Scanner s = new Scanner(System.in);
        System.out.print("Enter you name: ");
        String name = s.nextLine();

        // user enters number of cookies eaten
        System.out.print("How many cookies did you eat? ");
        int numCookies = s.nextInt();

        // output calories consumed
        int servingSize = cookiesInABag / servingsInABag;
        float userServings = (float)numCookies / servingSize;
        float userCalories = userServings * servingCalories;

        System.out.println(name + ", you ate " +
                            userCalories + " calories."

        );

    }
}
