package ConstructorOverload;
class B
{
    public static int a=25;
    String name="India";
    public void print()
    {
        String name="BTM";
        System.out.println(name);
        System.out.println(this.name);
    }
    public static void main(String[] args) {
        {
            B obj=new B();
            obj.print();
            System.out.println(obj.name);
       }
    }
    
}
