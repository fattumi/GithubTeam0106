package ders17_scope;

public class C02_ClassLevelVariables {



    // class level variables'lar method'larin disinda olusturulur
    // genel kullanim en ustte olusturulmalidir.

    static String hastaneismi="Yildiz Hastanesi";
    static int hasaSayisi=23454;
    static String basHekimIsmi;
    String persIsmi="isim girilmedi";
    String persTlf="telefon girilmedi";
    int persYas;




    public static void main(String[] args) {
        System.out.println(hastaneismi); // Yildiz Hastanesi
        System.out.println(basHekimIsmi); // null
        // System.out.println(persIsmi); // satatic olmadigi icin static main method'dan kullanilamaz

        /*
        Class levele variabler'a deger atamasi yapilmamis olursa
        Java bu variabler 'lara data turune gore
        default tanimlanan degerleri atar
        default degerler
        sayisal varianle'la :0
        boolean : false
        char :''
        Objeler (String dahil) : null
         */


    }

    public static void method(){
        System.out.println(hasaSayisi);
        hasaSayisi++;
        // System.out.println(persIsmi);


    }

    public void method2(){
        System.out.println(hastaneismi); // Yildiz Hastanesi
        hasaSayisi++;
        System.out.println(persIsmi); // Isim girilmedi
        System.out.println(persYas); // 0



    }
}
