package Initilizer;

public class NewB {
    public static void main(String[] args) {
        {
            
            System.out.println("Hum hai Main method");
          
        }
    }
    static //static initializer Block
    {
        System.out.println("Hum  Hai Static Block");
        NewB.add();
    }
    public static void add() //static initilizer Method
    {
        System.out.println("Hum  hai Static Method ");
        System.out.println(20+30);
    }
}
