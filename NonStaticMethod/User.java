package NonStaticMethod;

public class User {
    String username;
    long contact;
    public User (String username,long contact)
    {
        this.contact=contact;
        this.username=username;
    }
    public static void main(String[] args) {
        User a=new User("Sunil", 9563535845l);
        User b=new User ("Raju ",9800217684l);
        a.display();
        b.display();
    }
    public void display()
    {
        System.out.println("Username "+username);
        System.out.println("Contact "+contact);
    
    
}
}
