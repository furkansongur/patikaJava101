import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        double weight, height, bmi;

        Scanner input = new Scanner(System.in);

        System.out.print("Kilonuz (kg): ");
        weight = input.nextDouble();

        System.out.print("Boyunuz (m): ");
        height = input.nextDouble();

        bmi = weight / (height * height);

        System.out.println("Body Mass Index: " + bmi);
    }
}
