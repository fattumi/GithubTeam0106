package ders11_stringManipulation;

public class C05_repeat_trim {
    public static void main(String[] args) {

        String str="java guzeldir\n";

        System.out.println(str.repeat(4));


        str= "     java guzeldir     ";

        System.out.println(str.length()); //23

        str=str.trim();

        System.out.println(str); // java guzeldir
        System.out.println(str.length()); //13

    }
}
