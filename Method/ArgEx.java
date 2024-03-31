public class ArgEx {
    public static void main(String[] args) {
        ArgEx.add(10,12);
        ArgEx.print();
        ArgEx.add(66,55);

    }
    public static void  print()
    {
        System.out.println("Hello");
    }
    public static void add(int a,int b)
    {
        System.out.println(a+b);
    }
}
