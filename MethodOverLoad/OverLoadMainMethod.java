public class OverLoadMainMethod {
    public static void main(String[] args) 
    {
        System.out.println("I am Orignal");
    
    OverLoadMainMethod.main();
    OverLoadMainMethod.main(20,70);
}
public static void main() {
    System.out.println("I am OverLoaded without Argument");
}
public static void main(int a,int b) {
    System.out.println("I am Over LOaded with Argument");
    System.out.println(a);
    System.out.println(b);
}
}



 