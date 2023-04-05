import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a,toplam=0,bin;
        System.out.print("Lütfen basamaklar toplamı girilecek sayıyı giriniz: ");
        a = input.nextInt();


        toplam += a%10;

        bin += a/1000;
        a = a- (bin*1000);
        bin = a -();



    }
}