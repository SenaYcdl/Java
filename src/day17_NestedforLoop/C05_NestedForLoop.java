package day17_NestedforLoop;

public class C05_NestedForLoop {
    public static void main(String[] args) {

        /*verilen input a gore *  lardan olusan
        asagidaki sekli olusturun

        *
        * *
        * * *
        * * * *
        * * *
        * *
        *

         */

        // artan kismi nested for loop ile yapalim

        int input = 6;

        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.println("");

        }

        for (int i =input-1; i>=1 ; i--) {
            for (int j = i; j >=1 ; j--) {
                System.out.print("* ");

            }
            System.out.println("");
        }
    }
}
