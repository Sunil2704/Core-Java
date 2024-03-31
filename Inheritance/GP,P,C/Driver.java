package Inheritance;

public class Driver {
    public static void main(String[] args) {
        {
            P a=new P();
            a.m2();
            a.m1();
           
                C b=new C();
                b.m1();
                P d=new P();
                d.m2();
        }
    }
    
}
