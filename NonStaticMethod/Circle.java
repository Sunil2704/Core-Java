package NonStaticMethod;

public class Circle {
    float radius;
    public Circle(float radius)
    {
        this.radius=radius;
    }
    public static void main(String[] args) {
        Circle c1=new Circle(8);
        c1.calculate();
    }
    public void calculate()
    {
        float Area=3.14f*radius*radius;
        System.out.println(Area);
    }
  
}
