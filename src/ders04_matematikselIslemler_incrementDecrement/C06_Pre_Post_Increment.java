package ders04_matematikselIslemler_incrementDecrement;

public class C06_Pre_Post_Increment {
    public static void main(String[] args) {

        int a = 10;

        // a variable'nin degerini yazdirip sonra a'nin degerini 1 artirin


        System.out.println(a); // 10

        a++;
        // a artik 11



        int b =10;

        // b variable'inin degerini 1 artirip sonra yazdirin

        b++;
        System.out.println("b : " + b); // 11




        int c = 10;
        // c variable'nin degerini yazdirip sonra c'nin degerini 1 artirin

        System.out.println("c: " + c++); // 10


        int d = 10;

        // d variable'inin degerini 1 artirip sonra yazdirin

        System.out.println("d : " + ++d); // 11


        /*

        c++ veya ++d yi yazdirma veya atama isleminde kullanirsaniz
        c++ 'e post increment denir. o satir icin once islemi yapar sonra artirmayi yapar
        ++d 'ye ise pre increment denir, once artirma yapip sonra islemi yapar

        islemin oldugu satirin bir alt satirina gecildiginde
        c'de d'de bir artmistir
         */










    }
}
