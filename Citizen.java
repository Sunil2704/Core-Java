class Citizen
{
    String name;
    long adno;
    String state;
    int pincode;
    public Citizen(String name,long adno,String state,int pincode)
    {
        this.name=name;
    this.adno=adno;
    this.state=state;
    this.pincode=pincode;
}
public Citizen(String name,long adno,String state)
{
this(name,adno,state,0);
}
public void zero()
{
    System.out.println("Name"+name);
    System.out.println("AAdhar Number "+adno);
    System.out.println("State"+state);
    System.out.println("pincode"+pincode);
}
public static void main(String[] args) {
    Citizen c1=new Citizen("Sunil", 9563538459563l,null);
    Citizen c2=new Citizen("Raju", 9800217684555l, "Uttar Pradesh",274303);
c2.zero();
c1.zero();
}

}