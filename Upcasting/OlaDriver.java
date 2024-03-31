package Upcasting;
import java.util.Scanner;;
public class OlaDriver {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println(" Enter option, 1: Auto    2:Mini    3: Sedan");
        int n=s.nextInt();
        switch (n)
        {
            case 1:
            {
                Auto a=new Auto();
                OlaDriver.book(a);
            }
            break;
            case 2:
            {
                Mini m=new Mini();
                OlaDriver.book(m);
            }
            break;
            case 3:
            {
                Sedan se=new Sedan();
            OlaDriver.book(se);
            }
            default: System.out.println("Invalid Input");
        }
        
    }
    public static void book(Ola ob)
    {
        ob.ride();
        if (ob instanceof Auto)
        {
            Auto x=(Auto)ob;
            x.costA();
        }
        else if(ob instanceof Mini);
        {
            Mini y=(Mini)ob;
            y.costM();
        }
    
        else
        {
        Sedan z=(Sedan)ob;
        z.costS();
        }
    }    
      
}


