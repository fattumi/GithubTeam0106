package ders04_matematikselIslemler_incrementDecrement;

import java.util.Scanner;

public class C02_DataCasting {
    public static void main(String[] args) {

        // Soru 4- Kullanicidan iki double sayi alin,
        // ilk sayiyi ikinci sayiyia bolun ve bolum isleminin sonucunun tamsayi kismini yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");

        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();

        int bolmeSonucuTamsayi= (int) (sayi1/sayi2) ;


        System.out.println(bolmeSonucuTamsayi);
    }
}
