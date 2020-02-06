package Basics.CountCharacters;

// A program that will count the number of occurrences of a particular letter in a given string

import java.util.Scanner;

public class countCharacters {

    //type psvm for shortcut
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // making an array of characters to contain the modified alphabet
        // characters used single quotes ' and strings use double quotes "
        char[] oldAlphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M'};
        char[] newAlphabet = {'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        // don't do this
        //char[] newAlphabet = new char[26];
        // newAlphabet[0] = 'N';
        // newAlphabet[1] = 'N'; .. and so on

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

        System.out.println("'A' is now a '" + (char)('A' + 13) + "'");

    }

}
