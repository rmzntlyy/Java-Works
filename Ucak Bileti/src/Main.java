import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double mesafe,tutar;
        int yas,a;


        System.out.print("Lütfen kaç KM gideceğinizi giriniz: ");
        mesafe = input.nextDouble();
        System.out.print("Lütfen Yaşınızı giriniz: ");
        yas = input.nextInt();
        System.out.println("Tek yön gideceksiniz 1'i , gidiş-dönüş seçecekseniz 2'yi seçiniz.");
        System.out.println("1:\n2:");
        a = input.nextInt();
        if (a==1 && mesafe>0 && yas>=0){

        tutar = mesafe*0.10;
        if (yas<12){
            tutar = tutar*0.5;
            System.out.print("İndirimli bilet tutarı: "+tutar);

        } else if (yas>=12 && 24>yas) {

            tutar=tutar*0.9;
            System.out.print("İndirimli bilet tutarı: "+tutar);
            

        } else if (yas>65) {
            tutar=tutar*0.7;
            System.out.print("İndirimli bilet tutarı: "+tutar);

        }else {

            System.out.print("Bilet tutarı: "+tutar);

        }


        } else if (a==2 && mesafe>0 && yas>=0) {

            tutar = mesafe*0.10;
            tutar = 2*(tutar- (tutar*0.2));
            if (yas<12){
                tutar = tutar*0.5;
                System.out.print("İndirimli bilet tutarı: "+tutar);

            } else if (yas>=12 && 24>yas) {

                tutar=tutar*0.9;
                System.out.print("İndirimli bilet tutarı: "+tutar);


            } else if (yas>65) {
                tutar=tutar*0.7;
                System.out.print("İndirimli bilet tutarı: "+tutar);

            }else {

                System.out.print("Bilet tutarı: "+tutar);

            }


        }else {
            System.out.print("Hatalı bir veri girdiniz.!");


        }
    }
}