package Array;

public class Employee {
   
    String ename;
    double salary;
    public Employee(String ename,double salary)
    {
        this.ename=ename;
        this.salary=salary;

    }
    public void display()
    {
        System.out.println("Employee Name -->"+ ename);
        System.out.println("Salary -->"+salary);
        System.out.println("----------------");
    }
}
