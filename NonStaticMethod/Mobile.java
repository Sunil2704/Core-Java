package NonStaticMethod;

public class Mobile {
    String brand;
    String color;
    int price;
    public Mobile(String brand, String color,int price)
    {
        this.brand=brand;
        this.color=color;
        this.price=price;
    
    }
    public void details()
    {
        System.out.println("Brand "+brand);
        System.out.println("Color  "+color);
        System.out.println("Price  "+price);
    }
    public static void main(String[] args) {
        Mobile a=new Mobile("LAva", "Wine", 4500);
       Mobile b=new Mobile("Samsung", "Blue", 7800);
        a.details();
        a.sale();
        b.details();
        b.sale();
    }
    public void sale()
    {
    double d=(price*0.80);
    System.out.println(" After Discount Price "+d);
    
  
}
}


