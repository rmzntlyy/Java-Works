import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] dizi ={15,12,788,1,-1,-778,2,0};
        int [] dizi2 = new int[1];

        Arrays.sort(dizi);
        System.out.println(Arrays.toString(dizi));
        System.out.print("Lütfen bir sayı giriniz: ");
        int sayi= input.nextInt();

        for (int i=0 ;i<dizi.length;i++){

            if (sayi<dizi[i]){

                System.out.println("Girilen sayıdan küçük en yakın sayı" +dizi[i-1] );
                System.out.println("Girilen sayıdan büyük en yakın sayı" +dizi[i] );
                break;
            }

        }

    }
}