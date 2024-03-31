public class Change {
    public static void convert(float a)
    {
        System.out.println((int)a);
    }
    public static void convert(char b)
    {
        System.out.println((int)b);
    }
    public static void convert(double c)
    {
        System.out.println((int)c);
    }
    public static void main(String[] args) {
        Change.convert(45.0f);
        Change.convert('b');
        Change.convert(100.0d);
    }
}
