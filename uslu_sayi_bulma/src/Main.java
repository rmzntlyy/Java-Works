import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int a=1,b=1,üs=1,total=1;

        System.out.print("Lütfen üssü alınacak sayıyı giriniz: ");
        a= input.nextInt();
        System.out.print("Lütfen üssü giriniz: ");
        b= input.nextInt();

            for (  ; b>=üs ;b--){
                total *= a;

            }
             System.out.println("Üs:" +total);

    }
}