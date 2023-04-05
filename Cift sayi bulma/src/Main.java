import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayi,sum=0;

        System.out.print("Lütfen sayıyı giriniz: ");
        sayi = input.nextInt();

        for (int i =0 ;i<=sayi;i++){

            if (i%3==0 && i%4==0){

                sum +=i;

            }

        }
        if (sum !=0) {System.out.println("3'e ve 4'e bölünen sayıların toplamı: "+sum);}else {
            System.out.println("3'e ve 4'e aynı anda bölünen bir sayı yok.");
        }
    }
}