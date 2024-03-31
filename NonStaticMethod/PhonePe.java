package NonStaticMethod;

public class PhonePe {
    
    public void login()
    {
        System.out.println(" Login to your Phone pe first");
        //checkBal();

    }
    public void checkBal()
    {
        System.out.println(" Balance bata de bhai ");
        login();
    }
    public static void main(String[] args) {
        {
            System.out.println("Main method" );
            PhonePe a=new PhonePe();
            a.checkBal();
        }
    }



}