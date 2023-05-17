package ders17_scope;

import java.util.Scanner;

public class C05_ObjectVariables {
    public static void main(String[] args) {

        // C03 class'indaki instance variable'lara nasil ulasabiliriz?
        // instance variable'larin deiger adi obje variable'laridir
        // instance variable'lara obje uzerinden ulasabilir

        Scanner scan= new Scanner(System.in);

        C03_ObjectVariables pers1=new C03_ObjectVariables();

        System.out.println(pers1.persIsmi); // isim girilmedi
        System.out.println(pers1.persYas); // 0


        pers1.persIsmi="Suleyman";
        pers1.persYas=35;
        pers1.persTlf="555.3456754";


        System.out.println(pers1.persIsmi); // isim girilmedi
        System.out.println(pers1.persYas); // 0


        C03_ObjectVariables pers2=new C03_ObjectVariables();

        pers2.persIsmi="Latife";
        pers2.persYas=32;
        pers2.persTlf="555.3456532";

        System.out.println(pers1.persIsmi); // Suleyman
        System.out.println(pers2.persIsmi); // Latife

        C03_ObjectVariables pers3=new C03_ObjectVariables();

        pers3.persIsmi="Heysem";
        pers3.persYas=30;
        pers3.persTlf="312 213 4567";

        System.out.println(pers1.persYas); // 35
        System.out.println(pers2.persYas); // 32
        System.out.println(pers3.persYas); // 30


    }
}
