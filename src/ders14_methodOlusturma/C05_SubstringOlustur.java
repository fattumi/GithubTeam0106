package ders14_methodOlusturma;

import javax.swing.*;

public class C05_SubstringOlustur {
    public static void main(String[] args) {

        /*

        sORU 1 - Kullanicidan input olarak verilen bir String,
        baslangic ve bitis indexlerine gore baslangic index'i dahil, bitis index'i haric olacak sekilde
        aradaki harfleri yazdiran bir method olusturun.
        - kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata mesaji verin
        -kullanici str'da olan index'lerden dah buyuk bir index girerse hata mesajı yazdirin

         */


        String input ="Java ne kadar guzel";
        int basIndexi=5;
        int bitindexi=7;

        kendiSubstringMethodumuz(input,basIndexi,bitindexi);

    }

    public static void kendiSubstringMethodumuz(String input, int basIndexi, int bitindexi) {

        if (basIndexi>bitindexi){
            System.out.println("Baslangic indexi, bitis indexinden buyuk olamaz");
        } else if (bitindexi>=input.length()) {
            System.out.println("Bitis indexi String'in sinirlari disinda");

        }else {

                // baslangic ve bitis indexlerine gore baslangic indexi dahil,
                // bitis indexi haric olacak sekilde
                // aradaki harfleri yazdiran bir method olusturun


                for (int i = basIndexi; i < bitindexi ; i++) {
                    System.out.println(input.charAt(i));
                }

                }
            }


    }


