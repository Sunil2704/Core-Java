package Upcasting;
import java.util.Scanner;
public class SwippingMachine {
    public static void main(String[] args) {
        {
            Scanner a= new Scanner(System.in);
            System.out.println("Enter option, 1:Debit Card  2:Credit Card");
            int option=a.nextInt();
            switch(option)
            {
                case 1:
                {
                    DebitCard d= new DebitCard();
                SwippingMachine.swipe(d);
                                          
                }
            break;
            case 2:
            {
                CreditCard c=new CreditCard();
                SwippingMachine.swipe(c);
            }
            break;
            default: System.out.println(" Invalid Option");
            }
        }
    }
    public static void swipe (Card ob)
    {
        ob.payment();
        if (ob instanceof DebitCard)

        {
            DebitCard x=(DebitCard)ob;
            x.debitBal();
        }
        else 
        {
            CreditCard y=new CreditCard();
            y.limit();
        }
    }
}

