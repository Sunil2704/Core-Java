package OOPs;

public class VariableShadowing {
    static int a = 12;

    public static void main(String[] args) {
        String a = "java";
        System.out.println(a);
        System.out.println(VariableShadowing.a);

    }
}
