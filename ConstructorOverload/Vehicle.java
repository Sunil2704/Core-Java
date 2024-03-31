package ConstructorOverload;

public class Vehicle {
    String brand ;
    String model;
    double price;
    String color;
    public Vehicle(String brand,String model,String color ,double price)
    {
        this.brand=brand;
        this.model=model;
        this.color=color;
        this.price=price;
        
    }
  public Vehicle(String brand,String model,String color)
  {
     this.brand=brand;
        this.model=model;
        this.color=color;
        
  }
   public Vehicle(String brand,String model)
  {
     this.brand=brand;
        this.model=model;
  }
  public void act()
  {
    System.out.println("Brand-->"+brand);
    System.out.println("Model-->"+model);
    System.out.println("Color-->"+color);
    System.out.println("Price-->"+price);
  }
  public static void main(String[] args) {
    Vehicle v1=new Vehicle("Suzuki", "Venz", "Red Wine", 2599999);
    Vehicle v2=new Vehicle("Maruti", "Dezire", "Grey");
    Vehicle v3=new Vehicle("Mahindra", "Xuv500");

System.out.println("--Vehicle Details Are Loading --");

    v1.act();
    System.out.println("-------------------");
    v2.act();
    System.out.println("-------------------");
    v3.act();

  }
}
