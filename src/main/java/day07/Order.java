package day07;

import java.util.HashMap;

public class Order {
    private static int orderCount =1000;

    private int orderCode;
    private HashMap<MenuItem, Integer> items = new HashMap<>();// items hasMap'in içinde yiyecekler ve kaç adet sipariş verildiği yer alıyor. örn pizza, 2 adet
    private double totalAmount=0;


    public Order() {
        orderCode = orderCount++;
    }

    public void addItem(MenuItem item,int adet){
        items.put(item,adet); //items seçenekler HashMap'ine argüman olarak verilen item(seçenek) eklenir.
        totalAmount += item.getPrice()*adet;
    }

    public int getOrderCode() {
        return orderCode;
    }

    public HashMap<MenuItem, Integer> getItems() {
        return items;
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}
