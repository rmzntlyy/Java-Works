import java.util.Scanner;

public class araba {

    String isim;
    String renk;

    int speed;

    int increasespeed (int s){

        speed+=s+speed;
        return speed;

    }}

public class rama {



    public static void main(String[] args){
       Scanner input = new Scanner(System.in);

       araba merco = new araba();
       merco.renk="kırmızı";
       merco.isim="mercedes";
       merco.speed=15;
       System.out.println(merco.increasespeed(15));



    }
}
