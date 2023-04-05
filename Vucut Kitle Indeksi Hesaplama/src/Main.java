import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double kg,boy,indeks;

        System.out.print("Lütfen boyunuzu metre cinsinden giriniz: ");
        boy = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz: ");
        kg = input.nextDouble();

        indeks = (kg / (boy*boy));

        System.out.println("Vücut kitle indeksiniz: " + indeks);


    }
}