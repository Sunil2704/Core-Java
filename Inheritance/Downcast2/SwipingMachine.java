package Downcast2;

import java.util.Scanner;

public class SwipingMachine {
    public static void main(String[] args) {
       try (Scanner s = new Scanner(System.in)) {
        System.out.println("Enter option, 1:CC   2:DC");
           int option=s.nextInt();
           switch(option)
           {
            case 1:
            {
                DebitCard d=new DebitCard();
                SwipingMachine.swipe(d);

            }
            break;
            case 2:
            {
                CreditCard c=new CreditCard();
                SwipingMachine.swipe(c);

            }
            break;
            default: System.out.println("Invalid maaal");
        }
    }
       }
       public static void swipe(Card ob)
       {
        ob.payment();
        if (ob instanceof DebitCard)
        {
            DebitCard x= (DebitCard)ob;
            x.debitCard();
        }
        else 
        {
            CreditCard y=(CreditCard)ob;
            y.creditCard();
        }
       
    }
}
