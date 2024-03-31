package OOPs;

public class Bottle {
    String brand;
    String color;
    int quantity;
    public Bottle(String brand ,String color,int quantity)
    {
        this.brand=brand;
        this.color=color;
        this.quantity=quantity;
    }
    public static void main(String[] args) {;
        Bottle  b=new Bottle("Milton", "Red", 2);
        Bottle  b2=new Bottle("Bisleri", "Grey", 2);
        System.out.println(b.brand);
        System.out.println(b.color);
        System.out.println(b.quantity);
        System.out.println(b2.brand);
        System.out.println(b2.color);
        System.out.println(b2.quantity);
    }
}
