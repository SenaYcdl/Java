package day14_MethodCreation;


import java.util.Scanner;

public class Test06_MethodCreation {
    public static void main(String[] args) {

        /*
        Email kontrolu yapan bir program yazin.Kullanici girdigi sifre
        -@ isareti icermiyorsa gecersiz email yazdirin
        -@gmail.com icermiyorsa "lutfen gmail adresinizi girin" yazdirin
        -@gmail.com ile bitmiyorsa "Yazimda bir sorun var,maili kontrol ediniz"
        */

        String gmail=mail();





    }

    public static String mail() {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen mail giriniz");
        String gmail=scan.nextLine();

        if (!gmail.contains("@")) {
            System.out.println("Gercersiz email");
        } else if (!gmail.contains("@gmail")) {
            System.out.println("Lutfen gmail adresinizi girin");
        }  else if (!gmail.endsWith("@gmail.com")) {
            System.out.println("Yazimda bir sorun var,maili kontrol ediniz");
        } else  {
            System.out.println("Email adresiniz kaydedildi");
        }
        return gmail;
    }
}
