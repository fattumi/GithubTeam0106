package ders13_nestedforLoop_methodOlusurma;

public class C01_ForLoop {
    public static void main(String[] args) {

        // Soru 9 (interview) - Kullanicidan bir Sring isteyin ve Stringi tersten yazdirin.

        String input="Java ne kadar guzel";

        // lezug

        for (int i = input.length()-1; i >=0 ; i--) {

            System.out.print(input.charAt(i));

        }

    }
}
