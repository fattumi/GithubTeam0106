package ders03_datacastingWrapperClass;

import javax.sound.midi.Soundbank;

public class C05_WrapperClass {
    public static void main(String[] args) {

        int sayi = 10;
        String str= "Java cok guzel";

         /*

        primitive data turleri sadece deger barındirirlar, hazir method'lari yoktur

        java'ya yapilan talepler sonucunda primitive methodlarin kullanilabilmesi icin
        wrapper class'lar olusturmustur.

        wrapper class'lar primitive data turlerindeki degerleri alirlar.
        ancak methodlarida vardir.
         */
        char krk= 'b';
        Character krkWrapper= 'c';
        System.out.println(Character.isLetter( '5')); // false

        System.out.println(Character.isDigit( '7')); // true

        String str1 = "123";
        String str2 = "12";

        //str1 ve str2'nin degerlerini matematiksel olarak toplayın

        System.out.println(str1 + str2); // 12312


        System.out.println(Integer.parseInt(str1) + Integer.parseInt(str2)); // 135

        // Integer.parseInteger(str) icine yazilan str rakamlardan olusuyorsa str'i int'a cevirir
        //ancak bir karakter bile rakam degilse hata verir

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);





    }
}
