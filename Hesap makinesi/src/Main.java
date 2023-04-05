import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1 , n2 ,k,sonc;
        System.out.println("İlk sayıyı giriniz:");
        n1 = input.nextInt();

        System.out.println("İkinci sayıyı giriniz:");
        n2 = input.nextInt();

        System.out.println("1-TOPLAMA\n2-ÇIKARMA\n3-ÇARPMA\n4-BÖLME");
        System.out.println("Seçiminiz nedir ?");
        k = input.nextInt();


        switch (k){

            case 1:
                sonc = n1+n2;
                System.out.println("1. ve 2. sayının toplamı: " +sonc);
                break;
            case 2:
                sonc = n1-n2;
                System.out.println("1. sayının 2. sayıdan farkı: "+sonc);
                break;
            case 3:
                sonc=n1*n2;
                System.out.println("1. ve 2. sayının çarpımı: "+sonc);
                break;
            case 4:
                if (n2!=0){
                    sonc=n1/n2;
                    System.out.println("1. sayının 2. sayıya bölümü: "+sonc);
                    break;
                }
                else {
                    System.out.println("Sayı2 0'a eşit olamaz.!");
                    break;
                }
            default:
                System.out.println("Yanlış işlem seçildi.");

        }
    }
}