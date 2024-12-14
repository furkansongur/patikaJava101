import java.util.Scanner;

public class CalculateVatAmount {
    public static void main(String[] args) {

        long price;
        double vatAmount;

        Scanner input = new Scanner(System.in);

        System.out.print("Ürün Fiyatı: ");
        price = input.nextLong();

        if (price > 0 && price < 1000) {
            vatAmount = price * 0.18;
        } else {
            vatAmount = price * 0.08;
        }

        System.out.println("KDV Tutarı: " + vatAmount);
    }
}
