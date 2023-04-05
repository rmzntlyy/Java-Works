import java.util.Scanner;

public class Main {


    static int donguazalt(int sayi,int kontrol){




             if ((sayi) >0){
                 System.out.print("  " + sayi +" ");
                 return donguazalt(sayi-5,kontrol);
             }
             else if (sayi<=0) {
                 donguartir(sayi,kontrol);

                 }


            return 0;
             }


    static int donguartir(int sayi,int kontrol){


        if (kontrol >= sayi){
            System.out.print("  "+sayi+ "  ");
            return donguartir(sayi+5,kontrol);
        }
        return 0;
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        int a= input.nextInt();
        int b=0;
        b=a;
        donguazalt(a,b);
    }
}



