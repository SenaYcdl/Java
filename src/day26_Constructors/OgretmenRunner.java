package day26_Constructors;

public class OgretmenRunner {
    public static void main(String[] args) {

        Ogretmen ogretmen1=new Ogretmen();
        System.out.println("Ogretmen1 " + ogretmen1);

        System.out.println("");

        Ogretmen ogretmen2=new Ogretmen("Emre", "Akdogan","1/1/2001","Matematik","Fizik");
        System.out.println("Ogretmen2: " + ogretmen2);

        System.out.println("");

        Ogretmen ogretmen3=new Ogretmen("Sena", "Yucedal", "2/12/1998");
        System.out.println("Ogretmen3: " + ogretmen3);
    }
}
