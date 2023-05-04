package ders17_scope;

public class C01_LocalVariables {
    public static void main(String[] args) {

        // Bir method'un icerisinde olusturulan variable'larin scop'u
        // icinde olusturduklari method'dur.
        // o method'un disindan ULASİLAMAZLAR - KULLANİLAMAZLAR

        int sayi = 10;
        String isim= "Ramazan";
        //System.out.println(dogruMU);

        for (int i = 0; i < 10; i++) {
            String adres="Ankara";

          // bir loop icerisinde olusturulan variableler sadece o loop icerisinde gecerlidir
        }

        // System.out.println(adres);

        double pi;

        // local variablelar deger atamadan olusturulabilir ancak KULLANILAMAZ.
        // kullanmadan once atanmis OLMALIDIRR
    }

    public static void method1(){

       //  System.out.println(sayi);
       //  isim="tugay";

        boolean dogruMu=true;
    }
}
