import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int adet,bir=0,iki=0,en_buyuk=0,en_kucuk=0 ;
        System.out.print("Kaç adet sayı gireceksiniz? ");
        adet = input.nextInt();




        for (int i=1;adet>=i;i++){

            System.out.println("Lütfen " +i +". sayıyı giriniz: ");
            bir = input.nextInt();

            if (bir>iki){
                en_buyuk =bir;

            }else {

                en_kucuk=bir;

            }


        }

        System.out.println("Girilen en büyük sayı: " + en_buyuk);
        System.out.println("Girilen en küçük sayı: "+en_kucuk);

    }
}