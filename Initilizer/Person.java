package Initilizer;

public class Person {
    String name;
    int age;
    public Person(String name ,int age)
    {
        this.name=name;
        this.age=age;
    }
    {
        //System.out.println("Upar }{ ye dono ke bich non static initilizer block hai");
    }
    public static void main(String[] args) {
        Person p=new Person("Raju", 24);
        Person q =new Person("Kaju", 21);
        p.details();
        q.details();
    }
    public void details()
    {
        System.out.println("Name-->"+name);
        System.out.println("Age-->"+age);

    }
}
