import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int yaricap;
        double aci;
        double pi = 3.14;





        System.out.print("Dairenin yarıçapını giriniz: ");
        yaricap=input.nextInt();

        double cevre = 2*pi*yaricap;
        double alan = pi*yaricap*yaricap;

        System.out.print("Daire diliminin açı ölçüsünü giriniz: ");
        aci = input.nextDouble();

        double aci_alan= (pi*yaricap*yaricap*aci)/360;


        System.out.println("\nDarienin çevresi: " +cevre);
        System.out.println("Dairenin alanı: " +alan);
        System.out.println("Daire diliminin alanı : " +aci_alan);

    }

}