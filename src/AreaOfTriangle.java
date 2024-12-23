import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        double base, height, area;

        Scanner input = new Scanner(System.in);

        System.out.print("Taban Uzunluğu: ");
        base = input.nextDouble();

        System.out.print("Yükseklik: ");
        height = input.nextDouble();

        area = (base * height) / 2;

        System.out.println("Üçgenin Alanı: " + area);
    }
}
