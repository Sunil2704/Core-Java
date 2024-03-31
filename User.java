class User
{
    String name;
    long contact1;
    long contact2;
    public User (String name,long contact1,long contact2)
    {
        this.name=name;
        this.contact1=contact1;
        this.contact2=contact2;
    System.out.println("Connstructor with 3 argument");
  }
  public User(String name,long contact1)
  {
    this(name,contact1,0);
    System.out.println("Constructor with 2 argument");
}
public void view ()

{
System.out.println("---details-----");
System.out.println("Name"+name);
System.out.println("Primary Number "+contact1);
System.out.println("secondary Number "+contact2);
}
public static void main(String[] args) {
    User a=new User(" Sunil",9563535845l);

a.view();
}
}