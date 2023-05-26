package day03;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Online alisveris programi yaziniz.

 * 1. Adim : "urunListesi" ve "urunFiyatlari" listesi olustur.
 * 2. Adim : olusturdugun urunListesine 3 urun daha ekle.
 * 3. Adim : "urunListesi"nden urun sectirdigin ve kac adet istedigini
 *            sordugun bir musteriSecim () olustur.
 * 4. Adim : Kullaniciya urunListesini goster
 *           Urun kodunu ve kac adet istedigini sor
 *           Baska bir urun almak isteyip istemedigini sor.
 *           istemiyorsa toplam odemesi gereken tutari
 *           eger kurulus gunune denk geldiyse "Borcunuz Yoktur" ,
 *           kurulus gunune denk gelmediyse toplam Tutari goster,
 *           baska urun almak istiyorsa tekrar urun sectir.     *
 *           Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
 * 5. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini "toplamOdeme"ye ekle.
 * 6. Adim : Alisveris bitince toplam odemesi gereken tutari goster.

 * */
public class OnlineAlisVerisSitesi {

    static Scanner input = new Scanner(System.in); //tekrar tekrar scanner oluşturmamak için static yaptım her yerden soru sorulabilsin cevap alınabilsin

    static List<String> urunListesi = new ArrayList<>(); //istenilenler listemi oluşturuyorum

    static List<Double> urunfiyatlari = new ArrayList<>(); //Fiyatlar listesi oluşturuyorum

    static double odenecekMiktar;

    public static void main(String[] args) {

        urunListesi.add("Saat Urun Kodu 0 ");
        urunListesi.add("Monitor Urun Kodu 1 ");
        urunListesi.add("Çanta Urun Kodu 2 ");
        urunListesi.add("TV Urun Kodu 3 ");
        urunListesi.add("Kitap Urun Kodu 4 ");


        urunfiyatlari.add(150.0);
        urunfiyatlari.add(3000.0);
        urunfiyatlari.add(5000.0);
        urunfiyatlari.add(6000.0);
        urunfiyatlari.add(100.0);


        List<String> yeniUrunler = new ArrayList<>();
        yeniUrunler.add("Takı Urun Kodu 5 ");
        yeniUrunler.add("Tencere Urun Kodu 6 ");
        yeniUrunler.add("Kiyafet Urun Kodu 7 ");

        urunListesi.addAll(yeniUrunler);

        List<Double> yeniUrunfiyatlari = new ArrayList<>();
        yeniUrunfiyatlari.add(9000.00);
        yeniUrunfiyatlari.add(200.00);
        yeniUrunfiyatlari.add(400.00);

        urunfiyatlari.addAll(yeniUrunfiyatlari);


        musteriSecim ();

    }

    public static void musteriSecim() {
        urunListesiniGoster();
        System.out.println("Lutfen urun kodunu giriniz");
        int urunKodu = input.nextInt();

        if (urunKodu>=0 && urunKodu<=urunListesi.size()){
            System.out.println("Kaç istediğinizi giriniz");
            int adet = input.nextInt();

            double toplamUrunFiyati = urunfiyatlari.get(urunKodu)*adet;
            odenecekMiktar+=toplamUrunFiyati;
            devamMi();

        }else {
            System.out.println("Lutfen geçerli bir urun kodu giriniz");
            musteriSecim(); //recursing Method (aynı methodu tekrar çağırmak)
        }

    }

    public static void devamMi() {
        System.out.println("Alisverise devam etmek istiyor musunuz? \n Evet ise ==>1 \n Hayir ise==> 2'ye basınız");
        int devamMi = input.nextInt();

        if (devamMi==1){
            musteriSecim();
        } else if (devamMi==2) {
            odemeYap();
        }else {
            System.out.println("Lütfen geçerli bir seçenek giriniz");
            devamMi();
        }
    }

    private static void odemeYap() {
        LocalDate kurulusGunu = LocalDate.of(2023,4, 9);
        LocalDate date = LocalDate.now();

        if (date.isEqual(kurulusGunu)){
            slowPrintln("TechPro Alısveris Sitesine Hoşgeldiniz. Bugün bizim yıl dönümümüz. Borcunuz yoktur",60);
        }else {
            slowPrintln("TechPro Alısveris Sitesini tercih ettiğiniz için teşekkür ederiz.  ", 60);
            System.out.println(odenecekMiktar+ " TL");
        }
    }//odemeYap()


    public static void slowPrintln(String metin, int gecikme) {
        for (char ch:metin.toCharArray() ) {     //toCharArray() metinden harf harf alır.
            System.out.print(ch);
            try {
                Thread.sleep(gecikme);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    public static void urunListesiniGoster() {
        System.out.println("*************  Urun Listesi  **********");

        for (int i = 0; i < urunListesi.size(); i++) {
            System.out.println(i+ " - "+urunListesi.get(i) + "Fiyat" + urunfiyatlari.get(i) + " TL");

        }

    }


}
