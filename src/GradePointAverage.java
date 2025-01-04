import java.util.Scanner;

public class GradePointAverage {
    public static void main(String[] args) {
        int mat, fiz, kim, tur, tar, muz;
        double average = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz: ");
        mat = input.nextInt();

        System.out.print("Fizik Notunuz: ");
        fiz = input.nextInt();

        System.out.print("Kimya Notunuz: ");
        kim = input.nextInt();

        System.out.print("Türkçe Notunuz: ");
        tur = input.nextInt();

        System.out.print("Tarih Notunuz: ");
        tar = input.nextInt();

        System.out.print("Müzik Notunuz: ");
        muz = input.nextInt();
        
        
        if (mat < 0 || mat > 100 || fiz < 0 || fiz > 100 || kim < 0 || kim > 100 || tur < 0 || tur > 100 || tar < 0 || tar > 100 || muz < 0 || muz > 100) {
            System.out.println("Geçersiz not girdiniz!");
            System.exit(0);
        } else {
            average = (mat + fiz + kim + tur + tar + muz) / 6.0;
        }
        

        if (average > 60) {
            System.out.println("Sınıfı Geçtiniz!");
        } else {
            System.out.println("Sınıfta Kaldınız!");
        }
    }
}
