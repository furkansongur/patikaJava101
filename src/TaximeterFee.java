import java.util.Scanner;

public class TaximeterFee {
    public static void main(String[] args) {
        double startFee = 10.0;
        double perKmFee = 2.20;
        double distance;


        Scanner input = new Scanner(System.in);

        System.out.print("Enter the distance: ");
        distance = input.nextDouble();

        double totalFee = startFee + distance * perKmFee;

        if(totalFee < 20.0) {
            totalFee = 20.0;
        }

        System.out.println("Total fee: " + totalFee);
    }
}
