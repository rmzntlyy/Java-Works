import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double km_ücreti = 2.20;
        double km;
        double ücret;
        int indi_bindi=20;
        int acilis=10;


       System.out.println("Gidilecek mesafeyi giriniz: ");
       km= input.nextDouble();

       if ((acilis+(km*km_ücreti))<20){
           System.out.println("Ödeyeceğiniz ücret: "+ indi_bindi);

       }
       else {
           ücret = acilis+(km*km_ücreti);

        System.out.println("Ödeyeceğiniz ücret: " + (ücret));
       }



    }
}