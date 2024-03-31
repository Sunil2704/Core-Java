package Vehicles;

public class Vehicle {
    String brand;
    double price;
    public Vehicle(String brand,double price)
    {
        this.brand=brand;
        this.price=price;
        System.out.println("vehicle");
    }
    public void detailsV()
    {
        System.out.println("BRAND"+brand);
        System.out.println("PRICE"+price);
    }

    
}
