package day07;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Hesap {


    private ArrayList<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);
    }
    public double getTotalAmount (){// toplam sipariş tutarı
        return orders.
                stream().
                mapToDouble(Order :: getTotalAmount).
                sum();
    }

    public void printHesap(){
        System.out.println("**************** HESAP FİŞİ *************");

        for (Order order: orders ) {

            System.out.println("Sipariş kodu: "+order.getOrderCode());
            System.out.println("Yiyecekler: ");

            HashMap<MenuItem, Integer> items = order.getItems();

            for (Map.Entry <MenuItem, Integer> entry:items.entrySet()) {

                MenuItem item = entry.getKey();
                int adet = entry.getValue();
                System.out.printf("%-20s   %d x   %.2f TL "+
                        item.getName(),adet,item.getPrice());//formatlı yazdırır
                //%:formatlı olarak yazdırır
                //-: sola yaslar
                //20 karakterlik yer ayırır
                //s: String data
                //d: tam sayı
                //%.2: virgülden sonra 2 basamak yazdır
                //f: ondalıklı sayılar için kullanılır.
            }
            System.out.println(order.getTotalAmount());

        }
        System.out.println(getTotalAmount());

    }

}
