package ders10_stringManipulation;

public class C05_Soru {
    public static void main(String[] args) {

        /*
         mail kontrolü yapan bir program hazirlayin
         1- mail @ isareti icermiyorsa "gecersiz email"
         2- @gmail.comicermiyorsa "gmail adresi giriniz"
         3- @gmail.com ile birmiyorsa "yazim hatasi"
         seklinde sonuc yazdirsin
        */

        String email="fatma@gmail.com";

        if (!email.contains("@")){

            System.out.println("gecersiz email");
        } else if (!email.contains("@gmail.com")){

        } else if (!email.contains("@gmail.com")) {
            System.out.println("yazim hatasi");

        }else {
            System.out.println("email basari ile kaydedildi");
        }

    }
}
