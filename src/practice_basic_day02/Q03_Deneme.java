package practice_basic_day02;

public class Q03_Deneme {
    public static void main(String[] args) {
        int sayi=55;
        int basamak=sayi/10;
        int onlar=basamak%10;

        switch(onlar) {
            case 0: System.out.println("Sifir"); break;
            case 1: System.out.println("bir"); break;
            case 2: System.out.println("iki"); break;
            case 3: System.out.println("uc");break;
            case 4: System.out.println("dort");break;
            case 5: System.out.println("bes");break;
            case 6: System.out.println("alti");break;
            case 7: System.out.println("yedi");break;
            case 8: System.out.println("sekiz");break;
            case 9: System.out.println("dokuz");break;

        }


    }
}
