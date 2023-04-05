//Ramazan ATALAY - 07.03.2023

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double akg,Armut = 2.14 ;
        double ekg,Elma = 3.67 ;
        double dkg,Domates = 1.11;
        double mkg,Muz = 0.95;
        double pkg, Patlican = 5.00;
        double tutar ;

        System.out.print("Armut Kaç kilo ? :");
        akg= input.nextDouble();
        System.out.print("Elma Kaç kilo ? :");
        ekg= input.nextDouble();
        System.out.print("Domates Kaç kilo ? :");
        dkg= input.nextDouble();
        System.out.print("Muz Kaç kilo ? :");
        mkg= input.nextDouble();
        System.out.print("Patlıcan Kaç kilo ? :");
        pkg= input.nextDouble();

        tutar = (akg*Armut) + ekg*Elma + dkg*Domates + mkg*Muz + pkg*Patlican;

        System.out.println("Tutar: "+tutar);
    }
}