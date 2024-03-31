package GetterSetter;

public class Execute {
    public static void main(String[] args) {
        Product p=new Product("BTM0123", 9563);
        System.out.println("Price is "+p.getPrice());
        p.setPrice();
        System.out.println("Price After Updating "+p.getPrice());

    }

}
