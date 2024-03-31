package DownString;

public class Driver {
    public static void main(String[] args) {
    Coffee e=new Expresso();
    e.ready();
    e.make();

    Coffee l=new Latte();
    l.make();
    l.ready();
    }
}
