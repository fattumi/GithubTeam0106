package ders15_overloading_whileLoop;

public class C02_Overloading {
    public static void main(String[] args) {

    }

    // Bir class'da ayni isim ve ayni signature'a sahip iki method olmaz
    public static void carpim(int sayi1, int sayi2){ // carpim int int

        System.out.println("Iki integer sayinin carpimi: " + sayi1*sayi2);


    }

    public static  void carpim (int sayi3, int sayi4, int sayi5){ // carpim int int int

        System.out.println("uc integer sayinin carpimi: " +sayi3*sayi4*sayi5);


    }

}
