import java.util.Scanner;

public class TotalFruitsPrice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double totalPrice = 0, kilos = 0;

        double pear = 2.14;
        double apple = 3.67;
        double tomato = 1.11;
        double banana = 0.95;
        double eggplant = 5.00;

        double[] prices = {pear, apple, tomato, banana, eggplant};
        String[] fruits = {"Pear", "Apple", "Tomato", "Banana", "Eggplant"};

        for (int i = 0; i < prices.length; i++) {
            System.out.print(" How many kilos of " + fruits[i] + " will you buy : ");
            kilos = input.nextDouble();
            totalPrice += prices[i] * kilos;
        }


        System.out.println("Total Price: " + totalPrice);
    }
}
