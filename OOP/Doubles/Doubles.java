package OOP.Doubles;

import java.util.Random;
import java.util.Scanner;

public class Doubles {
    public static void runGame() {

        //two dice for the doubles game
        int die1;
        int die2;

        //player starts with $100
        int money = 100;

        //creating random objects
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String input; //will store user's input

        System.out.println("The Game Begins!");
        do {

            die1 = random.nextInt(6) + 1;
            die2 = random.nextInt(6) + 1;

            System.out.print("You rolled a " + die1);
            System.out.println(" and a " + die2);

            //shoot doubles!
            if (die1 == die2){
                money *= 2; // double the money, money = money * 2
                System.out.println("You WIN!!!");
            } else {
                money -= 20; // subtract 20, money = money - 2
                System.out.println("You lose $20.");
            }

            if (money > 0){
                System.out.println("You now have $" + money + " left.");
                System.out.print("Would you like to play again (y/n): ");
                input = scanner.nextLine();

            } else {
                System.out.println("You are now broke!");
                input = "n"; // so that it wont loop any more
            }

        } while(input.equals("y"));

        System.out.println("The Game Ends...");

    }

    public static void main(String[] args) {
        runGame();
    }
}
