package ders08_ternary_switch;

public class C08_SwitchCase {
    public static void main(String[] args) {
        // Soru 6- Kullanici ay  numarisini alip mevsimi yazdirin


        int ayNo= 5;

        switch (ayNo){

            case 12:
            case 1 :
            case 2 :
                System.out.println("Kis");
                break;
            case 3 :
            case 4 :
            case 5 :
                System.out.println("İlkbahar");
                break;
            case 6 :
            case 7 :
            case 8 :
                System.out.println("Yaz");
                break;
            case 9 :
            case 10:
            case 11:
                System.out.println("Sonbahar");
                break;
            default:
                System.out.println("Gecersiz gun no");

        }
    }
}
