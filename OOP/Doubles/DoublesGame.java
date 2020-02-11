package OOP.Doubles;

import java.util.Scanner;

public class DoublesGame {

    // two dice for the doubles game
    private Die die1;
    private Die die2;
    private int money;

    public void setMoney(int money) {
        if (money >= 0) {
            this.money = money;
        } else {
            System.out.println("Error: money must be positive.");
        }
    }

    public DoublesGame() {
        initialize();
        money = 100;
    }

    public DoublesGame(int money) {
        initialize();
        setMoney(money);
    }

    private void initialize() {
        die1 = new Die();
        die2 = new Die();
    }

    private void rollTheDice() {
        die1.roll();
        die2.roll();

        System.out.print("You rolled a " + die1.getValue());
        System.out.println(" and a " + die2.getValue());
    }

    private void checkForWin() {
        // shot doubles!
        if (die1.getValue() == die2.getValue()) {
            System.out.println("You WIN!! ");
            setMoney(money * 2);
        } else {
            // lose $20, if not doubles
            System.out.println("You lose $20. ");
            setMoney(money - 20);
        }
    }

    public void run() {

        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("The Game Begins!");
        do {
            rollTheDice();
            checkForWin();

            // determine if player still has money
            if (money > 0) {
                System.out.println("You now have $" + money);

                System.out.print("Play again? (y/n) ");
                input = scanner.nextLine();
            } else {
                // player has lost all money and must exit game
                System.out.println("You have lost all your money.");
                input = "n";
            }

        } while(input.equals("y"));
        System.out.println("The Game Ends...");
    }
}