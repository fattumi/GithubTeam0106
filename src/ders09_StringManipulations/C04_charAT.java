package ders09_StringManipulations;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class C04_charAT  {
    public static void main(String[] args) {

        String str= "Java Candir";

        System.out.println(str.charAt(0)); // ilk harfi verir J

        System.out.println(str.charAt(5)); // 5.ci index'teki char'i verir C

        System.out.println(str.charAt(10)); // bana sonuncu karakteri yazdirir

        /*
        bir metindeki karakter sayisi ile son index arasinda 1 fark vardir
        bu metin icin karakter sayisi 11
        son index 10 dur
         */

        System.out.println(str.charAt(1)); //
    }
}
