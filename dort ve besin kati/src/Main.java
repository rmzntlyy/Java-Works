import java.util.Scanner;

public class Main {
    public static void main(String[] args)

    {
        Scanner input = new Scanner(System.in);

        int gir ,tut=1;


        System.out.print("Lütfen sayi giriniz.: ");
        gir = input.nextInt();
        System.out.println("Girilen sayi: "+gir);

        while (gir>=tut)  {

            if (tut%4 == 0 && tut%5==0){
                System.out.println(tut+ " Sayisi 4've 5'in katidir.");
            }






            tut++;
    }







    }
}