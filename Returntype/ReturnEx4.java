public class ReturnEx4 {
    
    public static void main(String[] args) 
    {
        ReturnEx4.display();

    }
    public static void display()
    {
        float a=35f;
        float b=95.2f;
        float c=88f;
        System.out.println(change(a, b, c));
     
    }
    public static int change(float x,float y,float z)
    {
    int p=(int)x;
    int q=(int)y;
    int r=(int)z;
    return p+q+r;

    }

}
