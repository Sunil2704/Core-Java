package OOPs;

public class Product {
    
    String brand;
    int pid;
    int price;
    public Product(String b , int id ,int p)
    {
        brand=b;
        pid=id;
        price=p;
    }
    public static void main(String[] args) {
        Product p1=new Product("YeZdi", 42, 249999);
        Product p2=new Product("Suzuki", 16, 124999);
        System.out.println(p1.brand);
        System.out.println(p1.price);
        System.out.println(p1.pid);
        System.out.println(p2.brand);
       

    }
}
