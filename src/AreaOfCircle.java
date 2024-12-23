import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        double pi = 3.14,radius, area;
        int angle;


        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        radius = input.nextDouble();

        System.out.print("Enter the angle: ");
        angle = input.nextInt();

        area = (pi * radius * radius * angle) / 360;

        System.out.println("Area of the circle: " + area);
    }
}
