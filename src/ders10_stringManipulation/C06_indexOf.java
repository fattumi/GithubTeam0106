package ders10_stringManipulation;

public class C06_indexOf {
    public static void main(String[] args) {

        String str= "Ahmet hoca ile hersey clear";

        System.out.println(str.indexOf("a")); // 9 ilk a'nin index'ini döndürür

        System.out.println(str.indexOf('c')); // 8

        System.out.println(str.indexOf("hersey")); // 15

        System.out.println(str.indexOf("e", 9)); //13

        // 13. index'deki e'den bir sonraki e'nin indexini bulalim

        System.out.println(str.indexOf("e",14)); //16

        // cumledeki 2.cinin indexini yazdirin

        int ilkcindex =str.indexOf("c"); //8

        System.out.println(str.indexOf("c",ilkcindex+1)); // 22

        System.out.println(str.indexOf("ali")); // index olarak integer dondurmesi bekleniyor

        System.out.println(str.indexOf("x")); // -1
    }
}
