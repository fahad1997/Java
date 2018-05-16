package inheritance;

public class Inheritance {

    public static void main(String[] args) {

        Customer c=new Customer();
        c.customerInfo();
        c.cDisplay();
        Owner o=new Owner();
        o.ownerInfo();
        o.oDisplay();
        Staff s=new Staff();
        s.staffInfo();
        s.sDisplay();
    }
    
}
