import java.util.Scanner;

public class Main {


    static int usal(int taban , int us){
         if (us<1) return 1;
         else return taban*usal(taban,us-1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen tabanı giriniz : ");
        int taban = input.nextInt();
        System.out.print("Lütfen üssü giriniz : ");
        int us = input.nextInt();

        System.out.print("Üs alma işleminin sonucu: "+usal(taban,us));
    }
}