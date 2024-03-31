package Vehicles;

public class Bike extends Vehicle {
int cc;

public Bike(String brand,double price,int cc)
{
    super(brand,price);
    this.cc=cc;
    System.out.println("Bike");
    System.out.println("------------------------");
}
public void detailsB()
{
    System.out.println("CC"+cc);
}
}
