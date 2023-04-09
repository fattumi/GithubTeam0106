package ders12_forLoops;

public class C06_Soru {
    public static void main(String[] args) {

        /*
        Soru - 8 (interview) - Kulllanicidan poziif bir sayi alin, 1'den baslayarak tum tamsayilari yazdirin, sirayla
        - 3 ile bolunebilen bir sayiya gelirse, sayi yerine fizz
        - 5 ile bolunebilen bir sayiya gelirse sayi yerine buzz
        - hem 3 hem 5 ile bolunebilin bir sayiya gelirse sayi yerine fizzBuzz yazdirin
         */

        int sayi= 130;

        for (int i = 0; i <sayi ; i++) {

            System.out.print(i + " ");

            if (i%3==0 && i%5==0){
                System.out.print("fizzBuzz\n");
            } else if (i%3==0) {
                System.out.print("fizz ");

            } else if (i%5==0) {
                System.out.print("buzz ");

            }else {
                System.out.print(i + " ");
            }

        }
    }
}
