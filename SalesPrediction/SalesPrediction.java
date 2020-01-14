package SalesPrediction;

public class SalesPrediction {

    public static void main(String[] args) {

        // The East Coast sales division of a company generates
        // 62 percent of total sales. Based on that percentage,
        // write a program that will predict how much the
        // East Coast division will generate if the company
        // has $4.6 million in sales this year.
        // Hint: Use the value 0.62 to represent 62 percent.

        int sales = 4_600_000;
        float percentage = 0.62f;

        float prediction = sales * percentage;

        System.out.println(
                "East Coast sales division will generate $" +
                prediction +
                " in sales.");

    }

}
