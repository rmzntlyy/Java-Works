import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a,b,c;

        System.out.print("Lütfen ilk sayıyı giriniz: ");
        a = input.nextInt();

        System.out.print("Lütfen 2. sayıyı giriniz: ");
        b= input.nextInt();

        System.out.print("Lütfen 3. sayıyı giriniz: ");
        c= input.nextInt();


        if (a>b){
            if (a>c){
                if (b>c){
                    System.out.println("a>b>c");

                }
                else {
                    System.out.println("a>c>b");

                }

            }else {

                System.out.println("c>a>b");
            }
        }else {
            if (b>c){
                if (c>a){
                System.out.println("b>c>a");}
                else {

                    System.out.println("b>a>c");
                }
            }else {
                System.out.println("c>b>a");

            }



        }



    }
}