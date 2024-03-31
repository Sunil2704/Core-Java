package Array;

public class EmployeeDriver {
    public static void main(String[] args) {
        Employee e1=new Employee("Sandeep", 48000);
         Employee e4=new Employee("Dhaniya", 7800.0);
          Employee e5=new Employee("Nirmal", 40000.12);
           Employee e3=new Employee("Uttam", 847000);
            Employee e2=new Employee("Rohit", 984023.00);
             Employee e6=new Employee("Purna", 35000.25);
              Employee e[]={e1,e2,e3,e4,e5,e6};
              System.out.println("---Employee Details---");
              for(int i=0; i<=e.length-1;i++)
              {
                if (e[i].salary<40000)
                {
                   e[i].display();
                }
                
              }


    }
}
