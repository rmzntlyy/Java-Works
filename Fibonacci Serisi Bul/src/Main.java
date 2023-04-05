import java.util.Scanner;

public class Main {



    public static int fibo(int adim){

        if (adim==1 || adim==2){

            return 1;
        }

        return fibo(adim-1) + fibo(adim-2);

    }





    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int adim=0;

        System.out.println("Lütfen adım sayısını giriniz: ");
        adim = input.nextInt();
        System.out.println("Fibo sayıları" + fibo(adim));






    }
}