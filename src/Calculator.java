import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        int n1, n2;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        n1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        n2 = scanner.nextInt();

        System.out.print("Enter operation (add, sub, mul, div): ");
        String operation = scanner.next();

        switch (operation) {
            case "add":
                System.out.println("Result: " + (n1 + n2));
                break;
            case "sub":
                System.out.println("Result: " + (n1 - n2));
                break;
            case "mul":
                System.out.println("Result: " + (n1 * n2));
                break;
            case "div":
                System.out.println("Result: " + (n1 / n2));
                break;
            default:
                System.out.println("Invalid operation");
        }
    }
}
