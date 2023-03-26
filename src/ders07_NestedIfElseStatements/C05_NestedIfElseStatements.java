package ders07_NestedIfElseStatements;

public class C05_NestedIfElseStatements {
    public static void main(String[] args) {
        // Soru2- Kullanicidan aldigi urun adedi ve liste fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun
        // musteri karti vrsa 10 urunden fazla alirsa %20 , yoksa %15 indirim yapin,
        // musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin.

        int urunAdedi=30;
        boolean kartVarMi=false;
        double listeFiyati= 12.5;
        double toplamFiyat=0;

        // ana degisken kart olsun

        if (kartVarMi){
            //kart var
            if (urunAdedi<0){
                System.out.println("hatali urun adedi girisi");
            } else if (urunAdedi<10) {
                toplamFiyat= urunAdedi*listeFiyati*0.85;
                System.out.println("%15 indirimli toplam fiyat : " + toplamFiyat);

            } else {
                toplamFiyat= urunAdedi*listeFiyati*0.80;
                System.out.println("%20 indirimli toplam fiyat : " + toplamFiyat);

            }
        }else {
            //kart yok
            if (urunAdedi<0){
                System.out.println("hatali urun adedi girisi");
            } else if (urunAdedi<10) {
                toplamFiyat= urunAdedi*listeFiyati*0.90;
                System.out.println("%10 indirimli toplam fiyat : " + toplamFiyat);

            }else {
                toplamFiyat=urunAdedi*listeFiyati*0.90;
                System.out.println("%15 indirimli toplam fiyat : " + toplamFiyat);
            }
        }
    }
}
