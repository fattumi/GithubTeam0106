package ders06_IfElseStatements;

public class C06_IfElseStatements {
    public static void main(String[] args) {

        /*
        if else statement'da {} kullanmazsak
        hem if body'si hem de else body'si icin sadece 1 satir kabul eder

        sonraki satirlar if-else ile iliskilendirilmez
        her durumda calisir
         */

        int not= 56;

        if (not>=50){
            System.out.println("Sinifi gectin");
            System.out.println("Yazin kafan rahat");

        } else{
            System.out.println("Bu dersten kaldin");
            System.out.println("Yaz okuluna bekleriz");
        }
    }
}
