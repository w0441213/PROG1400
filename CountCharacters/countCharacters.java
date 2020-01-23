package CountCharacters;

// A program that will count the number of occurrences of a particular letter in a given string

import java.util.Scanner;

public class countCharacters {

    //type psvm for shortcut
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        //type sprt for shortcut
        System.out.print("Please enter a string: ");
        String str = s.nextLine();

        System.out.print("Please enter a character: ");
        String input = s.nextLine();
        // char is data type for character
        // making each character a single character and holding it into "ch"
        char ch = input.charAt(0);

        // loop through each letter in the string
        int count = 0;
        //str.length() -- needs the parenthesis but arrays don't usually need it otherwise
        for (int i=0; i<str.length(); i++){
            // checking if the character is equal to the character input
            if (ch == str.charAt(i)) {
                count++;
            }
        }

        System.out.println("There are " + count + " '" + ch + "s in " + str);

    }
}
