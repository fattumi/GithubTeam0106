package ders08_ternary_switch;

public class C04_Ternary {
    public static void main(String[] args) {
        // Soru 2- Kullanicidan bir ucgenin kenar uzunlugunu alin;
        // ucgen eskenar ise "Eskenar ucgen" yazdirin, degilse "Eskenar degil" yazdirin

        int kenar1=10;
        int kenar2=10;
        int kenar3=10;

        System.out.println(kenar1==kenar2 && kenar2==kenar3 ? "Eskenar ucgen" : "Eskenar ucgen degil");

        // Soru 5- Kullanicidan iki sayi alin ve buyuk olmayan sayiyiyi yazdirin

        int sayi1=11;
        int sayi2=11;

        System.out.println(sayi1>sayi2 ? sayi2 :sayi1);
    }
}
