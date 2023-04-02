package ders11_stringManipulation;

public class C02_replace {
    public static void main(String[] args) {

        String str= "Java candir";

        System.out.println(str.replace('a', 'A'));

        System.out.println(str.replace(' ', '_')); // bosluk yerine _ (alt cizgi)

        System.out.println(str.replace("candir", "cok guzeldir")); // Java cok guzeldir

        System.out.println(str.replace(" ", "")); // Javacandir

        //String'deki tum a'lari silin
        System.out.println(str.replace("a", "")); // Jv cndir

        // Java yerine Hava, candir yerine cok guzel yazdiralim
        System.out.println(str.replace("Java", "Hava")
                .replace("candir","cok guzel")); // Hava cok guzel

        System.out.println(str.replace("","_"));

        // sadece 1.a'yi A yapin
        System.out.println(str.replaceAll("a","A")); // JAva candir

        //
    }
}
