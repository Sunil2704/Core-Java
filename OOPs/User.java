package OOPs;

public class User {
    String username;
    long contact;
    public User(String username,long contact)
    {
    this.username=username;  // if we are not using this keyword then local variable shadow the global variable.
    this.contact=contact; 

} 
public static void main(String[] args) {
    User a=new User("Sunil",9563535845l);
    User b=new User("Prateek", 9800217684l);
    System.out.println(a.contact);
    System.out.println(a.username);
    System.out.println(b.username);
    System.out.println(b.contact);
}
}
