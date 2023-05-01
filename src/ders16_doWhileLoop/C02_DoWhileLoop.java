package ders16_doWhileLoop;

public class C02_DoWhileLoop {
    public static void main(String[] args) {

        // 10, 11, 12 sayilar,n, toplayan bir while loop olurturalim


        int sayi=10;
        int toplam=0;

        do{

            toplam= toplam+sayi;

            sayi++;

        }while (sayi<=12);

        /*

        Do while loop,2un 2 avantajı vardir
        1- Loop body'si en az bir kere calisir
           (while loop'da baslangic degeri uygun degilse, loop body'si hic calismayabilir)

        2- while bitis kontrolu loop kadar calisir
           ( while loop'da bir kere fazla calisirdi)

         */

    }
}
