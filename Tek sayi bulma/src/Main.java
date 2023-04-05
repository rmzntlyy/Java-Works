import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int gir,toplam=0;

        do {

            System.out.print("Lütfen sayıyı giriniz: ");
            gir = input.nextInt();

            if (gir%2 != 0 ){

                System.out.print("Girilen sayı "+gir+ "tek bir sayıdır.");
                break;
            }else  {
                if (gir%4==0){
                toplam += gir;}

            }
        }

        while (gir>0 && gir%2 !=1 ); {
            if (toplam !=0){
            System.out.print("\nTek sayı girilene kadar 4'ün katı olan sayıların toplamı: "+toplam);}

        }
    }
}