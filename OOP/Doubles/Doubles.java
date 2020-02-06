package OOP.Doubles;

import java.util.Scanner;

public class Doubles {
    public static void runGame() {

        //two dice for the doubles game
        Die die1 = new Die();
        Die die2 = new Die();

        //player starts with $100
        int money = 100;

        Scanner scanner = new Scanner(System.in);
        String input; //will store user's input

        System.out.println("The Game Begins!");
        do {

            die1.roll();
            die2.roll();

            System.out.print("You rolled a " + die1.value);
            System.out.println(" and a " + die2.value);

            //shoot doubles!
            if (die1.value == die2.value){
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
