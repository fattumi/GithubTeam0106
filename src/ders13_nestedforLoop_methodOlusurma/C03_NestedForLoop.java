package ders13_nestedforLoop_methodOlusurma;

public class C03_NestedForLoop {
    public static void main(String[] args) {

        // 1-4 arasindaki sayilar icin carpim tablosu olusturalim.

        // Dis dongu satirlari kontrol eder

        for (int i = 1; i <=5 ; i++) {

            // ic dongu her satirda olan degerleri kontrol eder

            for (int j = 1; j <=5 ; j++){

                System.out.print(i*j + " ");

            }

                // İc dongu bitiginde javayi alt satira indiröeliyiz

                  System.out.println("");

        }
    }
    }

