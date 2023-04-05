import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    float veri,vergi,vergili;

    System.out.print("Lütfen KDV'si hesaplanacak olan değeri giriniz: ");
    veri=input.nextFloat();


    if (veri>1000) {
        System.out.println("KDV'siz fiyat: " + veri + " Tl");

        vergi = veri * 8 / 100;
        vergili = vergi + veri;

        System.out.println("KDV'li fiyat: " + vergili);
        System.out.print("KDV miktarı: " + vergi);
    } else if ((1000.0 >= veri)) {
        if (veri>=0){
            System.out.println("KDV'siz fiyat: " + veri + " Tl");

            vergi = veri * 18 / 100;
            vergili = vergi + veri;

            System.out.println("KDV'li fiyat: " + vergili);
            System.out.print("KDV miktarı: " + vergi);

        }else {

            System.out.println("Hatalı değer girdiniz.");
        }
    }}
}