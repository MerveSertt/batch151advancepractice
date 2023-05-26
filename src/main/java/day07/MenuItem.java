package day07;
//Bu classta menü seçenekleri oluşturacağım

public class MenuItem {
    //Yiyeceklerin kodu, ismi ve ücreti olsun. Değiştirilmemesi için private yaptım
    private int code;
    private String name;
    private double price;

    //contructerları çağırıyorum
    public MenuItem(int code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }
//parametresiz constructer da oluşturdum
    public MenuItem() {
    }

    //getterları da ekliyorum
    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
