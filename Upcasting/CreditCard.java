package Upcasting;

public class CreditCard extends Card{
    public void payment ()
    {
        System.out.println("Payment Done by using Credit Card");

    }
    public void limit()
    {
        System.out.println("Monthly Amount is Reduced by Some Amount");
    }
}
