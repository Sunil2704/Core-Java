package Vehicles;

public class EBike extends Bike{
    String batteryCapicity;
    public Object detailsE;

    public EBike(String brand, double price, int cc,String batteryCapicity) {
        super(brand, price, cc);
        this.batteryCapicity=batteryCapicity;
        System.out.println("EBike");
        System.out.println("-----------------------");
        
    }
    public void detailsE()
    {
        System.out.println("BAttery"+batteryCapicity);
    }
    
}
