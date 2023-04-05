import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int giris;



        System.out.print("Lütfen yılı giriniz: ");
        giris = input.nextInt();

        if (giris%4==0) {

            System.out.println(giris + " yılı bir artık yıldır.");
        }else {
            System.out.println(giris +" yılı bir artık yıl değildir.!");

        }




    }
}