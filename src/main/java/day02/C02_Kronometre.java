package day02;

import java.util.Scanner;

public class C02_Kronometre {
    /*
                    KRONOMETRE  2023/04 QA INTERWIEW
     
        Kullanıcının belirlediği sayıda işlemi gerçekleştiren,
        sonunda toplam süreyi ve
        ortalama süreyi kullanıcıya gösteren bir kronometre
        kodunu yaziniz.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen kaç kez işlem yapılacağını giriniz.");
        int numTasks = input.nextInt(); //görev sayısını alıyorum
        
        long starTime = System.currentTimeMillis(); //currentTimeMillis() milisaniye olarak anı verir.

        for (int i = 0; i < numTasks; i++) {
            int numbers[] = {1,2,3,4,5};
            int sum = 0;
            for (int number : numbers) {
                sum= sum+number;
            }
            System.out.println("sum = " + sum);
            System.out.println("işlem " + (i+1) + " tamamlandı");
        }
        long endTime = System.currentTimeMillis();

        long islemSuresi = endTime - starTime;
        System.out.println("işlem süresi = " + islemSuresi);

        System.out.println("Ortalama süre = " + (double)islemSuresi/numTasks + "milisaniye");

        

        
    }
}
