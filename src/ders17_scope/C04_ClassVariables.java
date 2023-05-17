package ders17_scope;

public class C04_ClassVariables {
    public static void main(String[] args) {

        // C03 teki hastane ismini yazdirmak istersek

        System.out.println(C03_ObjectVariables.hastaneismi);

        System.out.println(C03_ObjectVariables.hasaSayisi);

        C03_ObjectVariables.hasaSayisi++;
        C03_ObjectVariables.hasaSayisi++;
        method1();

        System.out.println(C03_ObjectVariables.hasaSayisi);

    }



    // kod takibi main method'dan baslar
    // main method'un sonuna gelindiginde hersey bier
    // tum degisimler resetlenir
    // variable degerleri bastaki hallerine doner


    public static void method1(){
        C03_ObjectVariables.hasaSayisi++;

    }


    /*

    Java Runtime programdir
    calismaya basladiginda variable'lara atanan
    degerleri isler

    calistigi muddetce yapilan degisiklikleri kaydeder
    ama calismasi bittiginide degisen degerler resetlenir
     */
}
