import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int a,sum=0;
        System.out.print("Lütfen bir sayı giriniz: ");
        a= input.nextInt();

        for (int i=1;i<a;i++){

            if (a%i==0){

                sum += i;


            }
        }
        if (sum==a){

            System.out.print(a+" Sayısı bir mükemmel sayıdır.!");
        }else {
            System.out.println(a+" Sayısı bir mükkemmel sayı değildir.!");
        }


    }
}