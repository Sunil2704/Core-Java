package Upcasting;

public class CardDriver {
    public static void main(String[] args) {
        DebitCard d=new DebitCard();
        
        CardDriver.swipe(d);
        }
        public static void swipe(Card ob)
        {
        ob.payment();
        }
}
