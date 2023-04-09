package ders12_forLoops;

public class C03_Faktoryel {
    public static void main(String[] args) {

        // Kullanicinin verdiği sayinin farkini bulalim

        // 5 ! = 5 * 4 * 3 * 2 * 1 = 120

        int sayi = 10;

        int faktaoryel= 1 ;

        for (int i = sayi; i >=1 ; i--) {

            faktaoryel= faktaoryel*i ;


        }

        System.out.println(faktaoryel);

        // 1'den 100'e kadar olan sayilari toplayin

        int toplam= 0;

        for (int i = 1; i <= 100 ; i++) {

            toplam=toplam+i;

        }

        System.out.println(toplam);
    }
}
