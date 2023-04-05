import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,nf=1,rf=1,nrf=1;
        int yeni,kombinasyon;

            System.out.print("Lütfen ilk sayıyı giriniz (1.sayı >= 2.sayı !): ");
            a = input.nextInt();
            System.out.print("Lütfen ikinci sayıyı giriniz: ");
            b = input.nextInt();
            yeni = (a-b);

if (a>=b){
        for(;a>0;a--){

            nf *=a;
        }
        for (;b>0;b--){

            rf *=b;

        }

        for (;yeni>0;yeni--){

            nrf *= yeni;
        }
        kombinasyon = nf/(rf*nrf);
        System.out.println( "Sayıların kombinasyonu: " +kombinasyon );
}else {
    System.out.println("Sayıları bir daha giriniz.");
}







    }
}