package ders13_nestedforLoop_methodOlusurma;

import java.util.Scanner;

public class C08_MethodOlusturma {
    public static void main(String[] args) {

        // Kullanicidan 2 sayi alip, toplamini yazdiran bir method olusturun


        isteToplaYazdir();
        isteToplaYazdir();
    }

    public static void isteToplaYazdir () {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");

        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();

        System.out.println("girilen sayilarin toplami :" + (sayi1 + sayi2));
    }

}
