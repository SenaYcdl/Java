package day43_Interfaces_Iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class M03_Iterator {
    public static void main(String[] args) {

        List<Integer> liste = new ArrayList<>();
        liste.add(10);
        liste.add(20);
        liste.add(30);

        System.out.println(liste); //[10, 20, 30]

        //listedeki tum elementleri Index kullanmadan 3 arttirin

        for (Integer each : liste) {
            each += 3;
            System.out.print(each + " ");  // 13 23 33
        }

        System.out.println("");
        System.out.println(liste); // [10, 20, 30]

        /*
        Java index yapisi olmayan collection lardaki elementlere ulasmak veya degistirmek icin
        iterator interface ini olusturmustur

        Iterator interface oldugundan ondan obje uretmemiz mumkun degildir
        bunun yerine bize iterator donduren liste.iterator() methodunu kullaniyoruz

         */

        Iterator it1 = liste.iterator();
        System.out.println(it1.next()); //10
        System.out.println(it1.next()); //20
        System.out.println(it1.next()); //30

        //System.out.println(it1.next()); // 30'dan sonra element kalmadigindan next() RTE verir

        // Iterator'da geri donus yok, adim adim sona ulastiktan sonra
        // basa gelmek isterseniz yeniden bir iterator olusturmaniz gerekir
        // [10, 20, 30]

        Iterator it2= liste.iterator();
        // yeni it2'yi kullanarak listenin tum elementlerini silelim
        it2.next();
        it2.remove();
        it2.next();
        it2.remove();
        it2.next();
        it2.remove();
        System.out.println(liste);  // iterator ile elementleri gezip, remove yapinca
        // liste kalici olarak degisti
        liste.add(10);
        liste.add(20);
        liste.add(30);
        System.out.println("yeniden liste : "+liste);


        Iterator it3= liste.iterator();
        while(it3.hasNext()){
            it3.next();
            it3.remove();
        }
        System.out.println("loop'dan sonra liste : "+liste);


        /*
         Goruldugu gibi Iterator kullanarak yapabildigim
         1- tum collection elementlerini yazdirmak
         2- tum collection elementlerini silmek
         Bu da bize yetmez
         */

    }
}
