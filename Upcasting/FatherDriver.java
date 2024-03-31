package Upcasting;

public class FatherDriver {
    public static void main(String[] args) {
        Father f=new Father();
        f.jobProfile();
     Father d=new Daughter();
     d.jobProfile();
     Daughter da=new Daughter();
     da.jobProfile();
        
    }
}
