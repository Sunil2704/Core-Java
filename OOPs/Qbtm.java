package OOPs;

public class Qbtm {

    String name;
    long contact;
    String mailId;
    String stream;
    String course;
    static String branch="QSpider";


public Qbtm()  //constructor
{
    System.out.println("Print Something");
}
public static void main(String[] args) {
    Qbtm a=new Qbtm();
    a.contact=956353545l;  //initializing data into reference variable
    a.mailId="pajapatisunil@gmail.com";

    System.out.println(a.contact);
    System.out.println(a.mailId);
}
}
