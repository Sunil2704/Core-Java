package ConstructorOverload;

public class A {
    int x;
    char y;
    public A()
    {
        System.out.println("Zero Argument");
    }
    public A(int x)
    {
        this.x=x;
        System.out.println("One Argument");
    }
    public A(int x,char y)
    {
        this.x=x;
        this.y=y;

        System.out.println("Two Argument ");
    }
    public A(char y)
    {
         this.y=y;
        System.out.println("One Char Argument");
    }
    public static void main(String[] args) {
        A a=new A();
        A b=new A('7');
        A c=new A(78, 'Y');
        A d=new A(789);

    }
}
