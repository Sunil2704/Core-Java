package Array;

public class Exceptionn {
    public static void main(String[] args) {
        String state[]={"Uttar Pradesh","Bihar","Jharkhand"};
        System.out.println(state[0]);
        System.out.println(state[1]);
        System.out.println(state[3]);  //ArrayIndexOutOfBoundsexception Will Occcurs
        System.out.println(state[2]);  // This Line Will Not Execute Further
    }
}
