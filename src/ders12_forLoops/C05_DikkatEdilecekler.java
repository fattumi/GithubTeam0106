package ders12_forLoops;

public class C05_DikkatEdilecekler {
    public static void main(String[] args) {


        /* Sonsuz Loop - ram dolup cokene kadar devam eder sakin deneme!!!!1


        for (int i = 0; i >-10 ; i++) {
            System.out.println(i + " ");

           }
         */

        // ilk deger icin true olmuyorsa for body si hic devreye girmez

        for (int i = 0; i > 10 ; i++) {
            System.out.println(i);

        }

        // bir Loop'u sonunu beklemeden bitirmek istersek

        // kullanacinin verdigi bir sayinin asal sayi olup olmadigi ni bukun

        // asal sayi 1 ve kendisi disinda hic bir tamsayiya tam bolunmeyen sayi

        int sayi= 103000;
        boolean bayrak=false;
        // boolean bayrak=false;

        for (int i = 2; i <=sayi-1 ; i++) {

            if (sayi %i==0){
                // askimiz bitti
               // bayrak=true;
                bayrak=true;
                break;
            }

        }

        System.out.println(bayrak);

        if (bayrak){
            System.out.println("asal sayi");
        }else {
            System.out.println("asal sayi degil");
        }


    }
}
