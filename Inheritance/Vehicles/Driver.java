package Vehicles;

public class Driver {
    public static void main(String[] args) {
        {
            EBike e=new EBike("TVS", 69000d, 180, null);
            e.detailsE();
            Bike b=new Bike("Honda", 73456d, 150);
            b.detailsB();
        }
    }
}
