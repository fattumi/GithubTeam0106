package ders14_methodOlusturma;

public class C03_StringTerseCevirme {


    // parametre olarak bir Sring kabul edşp
    // String'in terse cevirilmis halini donduren bir method olusturun

    public static void main(String[] args) {

        String input = "java kod yazdikca ogrenilir";

        System.out.println(stringiTerseCevir(input));

    }

    public static String stringiTerseCevir(String input){

        String tersStr="";

        for (int i = input.length()-1; i >=0 ; i--) {

            tersStr=tersStr + input.charAt(i);

        }

        return tersStr;
    }

}
