import java.util.Scanner;

public class GradePointAverage {
    public static void main(String[] args) {
        int mat, fiz, kim, tur, tar, muz;
        double average;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz: ");
        mat = input.nextInt();

        System.out.print("Fizik Notunuz: ");
        fiz = input.nextInt();

        System.out.println("Kimya Notunuz: ");
        kim = input.nextInt();

        System.out.println("Türkçe Notunuz: ");
        tur = input.nextInt();

        System.out.println("Tarih Notunuz: ");
        tar = input.nextInt();

        System.out.println("Müzik Notunuz: ");
        muz = input.nextInt();

        average = (mat + fiz + kim + tur + tar + muz) / 6.0;

        if (average > 60) {
            System.out.println("Sınıfı Geçtiniz!");
        } else {
            System.out.println("Sınıfta Kaldınız!");
        }
    }
}
