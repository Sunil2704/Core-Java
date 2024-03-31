package GetterSetter;

import java.util.Scanner;


public class PinContact {
    
        private int pin;
        private long contact;
        public PinContact(long contact,int pin)
        {
            this.contact=contact;
        this.pin=pin;
    }
    public void setContact()
    {
        System.out.println("Enter Your Registered Number");
        Scanner c=new Scanner(System.in);
        long d=c.nextLong();
        if(d==contact)
            System.out.println("Enter You New Number");
            long contact=c.nextLong();
            System.out.println("Bingo ,You Logged Inn With You New Number");
        
    }
    public void setPin()
    {
        System.out.println("Enter Your Old Pin");
        Scanner e=new Scanner(System.in);
        int f=e.nextInt();
        System.out.println("1: Change Pin   2:Change Number");
         Scanner x=new Scanner(System.in);
        int y=x.nextInt();
        switch (y)
        {
            
        case 1:
        {
            System.out.println("Enter Your New Pin");
             Scanner o=new Scanner(System.in);
        int pin=o.nextInt();
        System.out.println("Pin Updated");

        }
        break;
        case 2:
        {
            System.out.println("Enter Your New Contact NUMBER");
            Scanner l=new Scanner(System.in);
        int contact=l.nextInt();
        System.out.println("Number Updated");
        }
        break;
        /*if(f==pin)
        {
        System.out.println("Enter New Pin ");
        int pin= e.nextInt();
        System.out.println("Pin Updated");
        }
        else{
            System.out.println("Entered Wrong Pin Try Forget Option");
        }*/
    }
   
}
    }

