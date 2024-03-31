package GetterSetter;

import java.util.Scanner;

public class Product {
    private int price;
    String pid;
    public Product(String pid,int price)
    {
        this.price=price;
        this.pid=pid;
    }
    public int getPrice()
{
    return price;
}
public void setPrice()
{
    Scanner p=new Scanner(System.in);
    System.out.println("Enter New Price To Update");
    price=p.nextInt();
    System.out.println("Price Updated");
}

}
