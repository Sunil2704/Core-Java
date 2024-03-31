public class MethodOverload4 {
    public static int add(int x, int y)
    {
        return x+y;
    }
    public static void add(int p,int q)
    {
        System.out.println(p+q);
    }
    public static void main(String[] args) {
        MethodOverload4.add(10,50);// error program; method add(int a,int b ) is already defind=ed in class MethodOverload4
    }

}
