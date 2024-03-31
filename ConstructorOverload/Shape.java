package ConstructorOverload;

public class Shape {
    float v1;
    float v2;
    public Shape(float v1,float v2)
    {
        this.v1=v1;
        this.v2=v2;
        {
            System.out.println("Area of A Rectangle-->"+v1*v2);
        }
    }
    public Shape(float v1)
    {
        this.v1=v1;
        {
         System.out.println("Area of Circle--->"+3.14f*v1*v1);   
        }
    }
        public void sdetails()
    {
    
    }
    public static void main(String[] args) {
        
        Shape s=new Shape(5);
        Shape s1=new Shape(4,5);
        s.sdetails();
       s1.sdetails();
        
    }
}
