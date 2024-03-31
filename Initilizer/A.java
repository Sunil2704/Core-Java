package Initilizer;

public class A {
    static{
        System.out.println("Start From Here");
    }
    {
        System.out.println("Executes ");
    }
    public A()
    {
        System.out.println("Explicit Construct Without Argument");
    }
    public static void main(String[] args) {
        {
            System.out.println("Main");
            A obj=new A();
            A obj2=new A();
        }
    }
}
