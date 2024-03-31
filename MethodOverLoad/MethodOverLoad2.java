public class MethodOverLoad2 {
    public static void main(String[] args) {
    MethodOverLoad2.display("QSpider");
    }


        public static void display(String a)
        {
            System.out.println(a);
        }
    public static void display(String b)// Compile Time Error --->Duplicate method (String a & String b)
    {
        System.out.println(b);
    }
}
    

    

