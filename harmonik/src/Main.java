import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double harmonik=0;
        System.out.print("Harmonik serisi bulunmak isteyen sayıyı giriniz: ");
        double a= input.nextDouble();

        for(;a>0;a--){


            harmonik += (1/a);

        }
        System.out.println("Girilen sayının harmonik ortalaması: "+harmonik);









    }
}