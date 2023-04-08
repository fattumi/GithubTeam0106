package ders11_stringManipulation;

public class C08_Soru {
    public static void main(String[] args) {

        // Soru 4 : Kullanicidan bir sifre isteyip,
        // asagidaki sartlari kontrol edin ve
        // kullaniciya duzeltmesi gereken tum eksiklieri soyleyin,
        // eger tum sartlari saglarsa , "sifre basariyla kaydedildi" yazdirsin
        // - ilk harf kucuk harf olmali
        // - son karakter rakam olmali
        // - sifre bosluk icermemeli
        // uzunlugu en az 10 karakter olmali


        String sifre= "nasilsinkardes1";
        int bayrak=0;

        if (!(sifre.charAt(0)>='a' && sifre.charAt(0)<='z' )){
            System.out.println("ilk harf kucuk harf olmali");
            bayrak++;
        }
        if (!(sifre.charAt(sifre.length()-1)>='0' && sifre.charAt(sifre.length()-1)<='9')){
            System.out.println("Son karakter rakam olmali");
            bayrak++;

        }

        if (sifre.contains(" ")){
            System.out.println("Sifre bosluk icermemeli");
            bayrak++;
        }

        if (!(sifre.length()>=10)){
            System.out.println("sifre en az 10 haneli olmali");
            bayrak++;
        }

        if (bayrak==0){
            System.out.println("Sifreniz basari ile kaydedildi");
        }
    }
}
