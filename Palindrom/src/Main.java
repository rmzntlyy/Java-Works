import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int gir;

        System.out.print("Lütfen bir sayı giriniz: ");
        gir = input.nextInt();
        palindrom(gir);
    }



    static boolean palindrom(int sayi){

        if (9>= sayi){
            System.out.println("Sayı bir palindrom sayı.");
            return true;

        } else if (sayi>=10 && sayi<100) {
            if (sayi%10 == sayi/10){
                yazdir(1);
                return true;
            }else {
                yazdir(0);
                return false;
            }
        }else if (sayi>=100 && sayi<1000){

            if (sayi/100 == sayi%10  ){
                yazdir(1);
                return true;

            }else {
                yazdir(0);
                return false;
            }

        }else {

            System.out.println("Tanımsız sayı");
            return false;
        }


   }

    static void yazdir(int sayi){

        if (sayi==1){
            System.out.println("Sayı palindrom.");

        }else{

            System.out.println("Sayı plindrom değil.");

        }}
}



