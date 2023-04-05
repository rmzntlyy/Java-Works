import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen üççgenin kenarlarını giriniz: ");
        System.out.println("1. kenarı giriniz: ");
        int kenar1 = input.nextInt();
        System.out.println("2. kenarı giriniz: ");
        int kenar2= input.nextInt();
        System.out.println("3. kenarı giriniz:");
        int kenar3= input.nextInt();

        int cevre;
        cevre = kenar1+kenar2+kenar3;

        float u = cevre/3;

        if (u>kenar1 && u>kenar2 && u>kenar3) {
            double alan = (u * (u - kenar1) * (u - kenar2) * (u - kenar3));
            double yeni_alan = alan * alan;
            System.out.println("Üçgenin alanı^2 : "+yeni_alan);
        }
        else {

            System.out.println("Girdiğiniz değerlerle alan hesaplanamaz.!");

        }

        System.out.println("Üçgenin çevresi: " + cevre);

    }
}