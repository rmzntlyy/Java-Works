import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int dogum,cikti;

        System.out.print("Lütfen doğum yılınızı giriniz: ");
        dogum= input.nextInt();

        cikti = dogum%12;
        
        if (cikti==0){
            System.out.println("Maymun");
            
        } else if (cikti==1) {
            System.out.println("Horoz");
        } else if (cikti==2) {
            System.out.println("Köpek");
        } else if (cikti==3) {
            System.out.println("Domuz");
        } else if (cikti==4) {
            System.out.println("Fare");
        } else if (cikti==5) {
            System.out.println("Öküz");
        } else if (cikti==6) {
            System.out.println("Kaplan");
        } else if (cikti==7) {
            System.out.println("Tavşan");
        } else if (cikti==8) {
            System.out.println("Ejderha");
        } else if (cikti==9) {
            System.out.println("Yılan");
        } else if (cikti==10) {
            System.out.println("At");
        } else if (cikti==11) {
            System.out.println("Koyun");
        }else {
            System.out.println("Yanlış bir veri girdiniz.!");
        }


    }
}