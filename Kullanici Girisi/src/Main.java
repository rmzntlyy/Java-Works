import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String answer ,username,username2 , password,password2;
        System.out.print("Lütfen Kullanıcı Adını giriniz: ");
        username = input.nextLine();
        System.out.println("Lütfen Şifreyi Giriniz:");
        password = input.nextLine();


        System.out.print("Şifrenizi sıfırlamak ister misiniz : 'Evet ' 'Hayır '");
        answer= input.nextLine();

        if (answer.equals( "Evet")){
            System.out.print("Lütfen yeni şifrenizi giriniz: ");
            password2= input.nextLine();

            if (password2 != password ){

                System.out.println("Şifreniz yenilendi.");
            }
            else  {

                System.out.println("Şifreniz eski şifre ile aynı olamaz!");
            }



        }




    }
}