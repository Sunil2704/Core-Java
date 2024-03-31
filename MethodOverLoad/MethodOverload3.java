public class MethodOverload3 {
    
        public static void display(int a, String b)
        {
        System.out.println(a+b);
        }
        public static void display (String a,String b)
        {
            System.out.println(a+b);
        }
    
    public static void main(String[] args) {
        MethodOverload3.display("Method ","Overload");
        MethodOverload3.display(20,"Chai"); 
    }
}


