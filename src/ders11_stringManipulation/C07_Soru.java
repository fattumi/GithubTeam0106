package ders11_stringManipulation;

public class C07_Soru {
    public static void main(String[] args) {

        // Soru 5 : Kullanicidan isim ve soyismini ayri ayri alin.
        // - ismi daha uzun ise, isim ve soyismi ilk harf buyuk, kalanlar kucuk seklinde yazdirin
        // - soyisim dah uzun ise ismi ilk harfi buyuk digerleri kucuk, soyismi buyuk harflerle yazdirin.

        String isim="Mehmet";
        String soyisim="Harun";

        if (isim.length()>soyisim.length()){
            // isim ve soyisim ilk harf buyuk kalanlar kucuk seklinde yazdirin

            String yeniIsimSoyisim= isim.substring(0, 1).toUpperCase() +
                                    isim.substring(1).toLowerCase() +
                                    " " +
                                    soyisim.substring(0,1).toUpperCase() +
                                    soyisim.substring(1).toLowerCase();
        }else {
            // ismi ilk harf buyuk digerleri kucuk, soyiami buyuk harflerle yazdirin.

        }
    }
}
