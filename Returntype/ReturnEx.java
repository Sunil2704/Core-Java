public class ReturnEx {
    public static void main(String[] args) {
        int total=ReturnEx.add(40,50);
        System.out.println("Added Result is "+total);
    }
    public static int add(int a,int b)
    {
        int c =a+b;
        return c;
    }
}
