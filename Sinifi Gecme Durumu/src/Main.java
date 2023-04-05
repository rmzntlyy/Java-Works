import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int m,f,t,k,mu;
        double ort;

        System.out.print("Lütfen 1. notu giriniz: ");
        m = input.nextInt();

        System.out.print("Lütfen 2. notu giriniz: ");
        f = input.nextInt();

        System.out.print("Lütfen 3. notu giriniz: ");
        t = input.nextInt();

        System.out.print("Lütfen 4. notu giriniz: ");
        k = input.nextInt();

        System.out.print("Lütfen 5. notu giriniz: ");
        mu = input.nextInt();

        if (m>=0 && f >= 0 && t>= 0 && k>=0 && mu>=0 && m <=100 && f <= 100 && t<= 100 && k<=100 && mu<=100){

          ort = (m+f+t+k+mu)/5;

          if (ort>=55){

              System.out.println("\nSınıfı geçtiniz.");
              System.out.println("Ortalama: " +ort);


          }
            else {
              System.out.println("Sınıfta kaldınız.");
              System.out.println("Ortalama: " +ort);
          }
        }else{

            System.out.println("Geçersiz not girdiniz.!");


        }
    }
}