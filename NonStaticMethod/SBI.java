package NonStaticMethod;

public class SBI {
    static String bank="SBI";
    long acno;
    long contact;
    double balance;
    public SBI(long acno,long contact,double balance)
    {
        this.acno=acno;
        this.contact=contact;
        this.balance=balance;
    }
    
    public static void main(String[] args) {
        SBI s1=new SBI(9563535845l,9563535845l,2500d);
        SBI s2=new SBI(9800217684l,9800217684l,8955d);
        s1.details();
        s2.details();
    }
    
    public void details()
    {
        System.out.println("BANK"+SBI.bank);
        System.out.println("Account Number"+acno);
        System.out.println("Phone Number "+contact);
        System.out.println("Balanc"+balance);
        
    }
    

}

