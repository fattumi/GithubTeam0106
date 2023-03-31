package ders10_stringManipulation;

public class C08_lastIndexOf {
    public static void main(String[] args) {

        String str= "Java hafiften beyin yakıyor";

        str.lastIndexOf("a"); // 21

        System.out.println(str.lastIndexOf("a")); //21

        System.out.println(str.lastIndexOf("e")); //15

        System.out.println(str.lastIndexOf("java")); // -1 (kucuk j ile oldugu icin)

        System.out.println(str.lastIndexOf("Java")); // 0 (ilk index)

        System.out.println(str.lastIndexOf("e", 14)); // 14 uncu indexten aramaya baslayacak





    }
}
