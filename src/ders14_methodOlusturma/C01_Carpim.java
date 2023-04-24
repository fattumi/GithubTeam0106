package ders14_methodOlusturma;

import java.util.Scanner;

public class C01_Carpim {
    public static void main(String[] args) {

        // Kullanicidan iki sayi alin
        //bu iki sayiyi parametre olarak kabul edip, carpimlarini main method'a donduren bir merthod olusturun

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");
        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();

        System.out.println(carpimMethodu(sayi1 , sayi2)); // 17.0

        double carpimSonucu= carpimMethodu(6,2); // 12
    }

    public static double carpimMethodu(double sayi1, double sayi2){
        System.out.println("carpim methodu calisti");
        return  sayi1 * sayi2;
    }
}
