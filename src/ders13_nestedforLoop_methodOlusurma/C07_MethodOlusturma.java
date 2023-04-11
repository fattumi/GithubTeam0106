package ders13_nestedforLoop_methodOlusurma;

public class C07_MethodOlusturma {
    public static void main(String[] args) {

        String str= "Java muhtesemdir";

        // metne buyuk harfe cevirin

        String buyukStr= str.toUpperCase();

        System.out.println(str); // Java muhtesemdi

        System.out.println(buyukStr); // JAVA MUHTESEMDIR

        // metnin buyuk harflere cevrilmis hali S icerir mi?

        System.out.println(buyukStr.contains("S")); // true


    }
}
