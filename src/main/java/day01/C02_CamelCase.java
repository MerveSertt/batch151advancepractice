package day01;

import java.util.Arrays;

public class C02_CamelCase {
    // INTERWIEW QUESTIONS QA AUTOMATION Nisan 2023
/*
    String str = "cats AND*Dogs-are Awesome"
    verilen String Datanin her bir kelimenin ilk harfini
    buyuk harf diger harfleri kucuk harf olacak
    "CatsAndDogsAreAwesome" sekilde veren kodu yaziniz
    input==> "cats AND*Dogs-are Awesome"
    output ==>"CatsAndDogsAreAwesome
 */

    public static void main(String[] args) {

        String str = "cats AND*Dogs-are Awesome";
        String word[] = str.split("[^a-zA-z]"); //split baştaki ve sondaki boşluğu silmez
        System.out.println(Arrays.toString(word)); //[cats, AND, Dogs, are, Awesome]
        StringBuilder sb = new StringBuilder();
        for (String w:word) {
            if (w.length()>0){ //boşluğu silmediği için burada o'dan küçükse diye if belirttik
                sb.append(w.substring(0,1).toUpperCase());
                if (w.length()>1){
                    sb.append(w.substring(1).toLowerCase());
                }//if
            }//if

        }//each
        System.out.println(sb); //CatsAndDogsAreAwesome








    }
}
