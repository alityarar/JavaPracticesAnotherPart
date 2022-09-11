package practice_basic_day02;

public class Q02_Deneme {
    public static void main(String[] args) {

        char finalNotu='A';

        String result="";

        result=(finalNotu=='A')?"Gayet basarili":
                (finalNotu=='B')?"Basarili":
                        (finalNotu=='C')?"zayif":"Digerleri..";

        System.out.println(result) ;

        //"?" soru isareti "ise" anlamina gelir
        //":" iki nokta ust uste, ilki dogru degilsa ikinci secenegi yazmak icin kullanilir


    }
}
