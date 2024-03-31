package NonStaticMethod;

public class Area {
    int length;
    int breath;
    public Area(int length,int breath)
    {
        this.breath=breath;
        this.length=length;
    }
    public static void main(String[] args) {
        Area a=new Area(25, 12);
        a.findArea();
    }
    public void findArea()
    {
        int d=length*breath;
        System.out.println(" Area of the Rectange is "+d);
        
    }
      
}
