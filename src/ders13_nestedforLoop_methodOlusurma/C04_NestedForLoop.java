package ders13_nestedforLoop_methodOlusurma;

public class C04_NestedForLoop {
    public static void main(String[] args) {

        /*
        Asagidaki sekli yazdiran bir kod hazirlayin

        * * * * * * * *
        * * * * * * * *
        * * * * * * * *
        * * * * * * * *
        * * * * * * * *

         */

        for (int i = 1; i <=5 ; i++) {

            for (int j = 1; j <=8 ; j++) {

                System.out.print("* ");

            }

            System.out.println(""); // ic loop bitince alt satira gec


        }
    }
}
