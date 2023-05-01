package ders16_doWhileLoop;

import java.util.Scanner;

public class C03_SifreKontrolu {
    public static void main(String[] args) {

        /*

        Soru-2 Kullanicidan bir sifre girmesini isteyin
        Girilen sifreyi asagidaki sartkara gore kontrol edin ve sifredeki hatalari yazdirin.
        Kullanici gecerli sifre girinceye kadar bu islemi tekrar edin
        ve gecerli sifre girdiginde "Sifreniz kabul edilmistir" yazdirin
        - Sifre kucuk harf icermelidir
        - Sifre buyuk harf icermelidir
        - Sifre ozel karakter icermelidir
        - Sifre en az 8 karakter icermelidir.
           SADECEa54
         */

        Scanner scan= new Scanner(System.in);
        String sifre;
        int bayrak;
        boolean sifreDogruMu;

        do{
            System.out.println("Lutfen vir sifre giriniz");
            sifre=scan.nextLine();
            // tum hatalarini soylemesini istiyorsak
            // bagimsiz if cumleleri ve bayrak kullanmak zorundayiz
            bayrak=0;
            int sonuc= kucukHarfKontroluYap(sifre);



        }



    }

    public static int kucukHarfKontroluYap(String sifre) {
        int bayrak=0;
        // - Sifre kucuk harf icermelidir
        // - bunun icin tum harfleri kontrol edecek bir for loop olusturulmalidir
        // - 1 tane kucuk harf bulmam yeterli olacak

        for (int i = 0; i <sifre.length() ; i++) {

            if (sifre.charAt(i)>='a' && sifre.charAt(i)<='z'){
                bayrak++;
                break;
            }

        }

        // bayrak==0 ise kucuk harf yoktur, yani hata vardir, bunu yazdiralim
        if (bayrak==0){
            System.out.println("Sifre kucuk harf icermelidir");
            return=0;
        }else  return 1;

    }
}
