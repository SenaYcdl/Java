package day14_MethodCreation;

import java.util.Scanner;

public class Test04_MethodCreation {
    public static void main(String[] args) {

        /*
        Kullaniciya kac sayi toplamak istedigini sorun kullanici 2,3 veya 4 degerini girerse,
        kullanicidan bu sayilari girmesini isteyin ve sayilarin toplamini yazdirin.
        kullanici toplamak istedigi sayi adedini 4'den buyuk girerse "cok sayi girdiniz,ben toplayamam" yazdirin
         */

        int sayi=0;

        sayiToplami(sayi);

    }

    public static int sayiToplami(int sayi) {

        Scanner scan = new Scanner(System.in);
        System.out.println("kac sayi toplamak istiyorsunuz?");
        int sayiAdedi= scan.nextInt();


        if (sayiAdedi==2){
            System.out.println("ilk sayiyi girin");
            int x1=scan.nextInt();
            System.out.println("ikinci sayiyi girin");
            int x2=scan.nextInt();
            System.out.println(x1+x2);
        } else if(sayiAdedi==3){
            System.out.println("ilk sayiyi girin");
            int x1=scan.nextInt();
            System.out.println("ikinci sayiyi girin");
            int x2=scan.nextInt();
            System.out.println("ucuncu sayiyi girin");
            int x3=scan.nextInt();
            System.out.println(x1+x2+x3);
        } else if (sayiAdedi==4){
            System.out.println("ilk sayiyi girin");
            int x1=scan.nextInt();
            System.out.println("ikinci sayiyi girin");
            int x2=scan.nextInt();
            System.out.println("ucuncu sayiyi girin");
            int x3=scan.nextInt();
            System.out.println("dorduncu sayiyi girin");
            int x4=scan.nextInt();
            System.out.println(x1+x2+x3+x4);
        } else if (sayiAdedi>4){
            System.out.println("Cok sayi girdiniz, ben toplayamam");
        } else {
            System.out.println("sayi adedi ikiden kucuk");
        }

        return sayi;

    }
}
