package inheritance;

public class Staff extends Person{

    String Designation;
    String CompanyName;
    double salary;
    
    public void staffInfo(){
        inputAll();
        System.out.println("Designation:");
        Designation=input.nextLine();
        System.out.println("Company Name:");
        CompanyName=input.nextLine();
        System.out.println("Salary:");
        salary=input.nextDouble();
    }
    public void sDisplay(){
        System.out.println("Stuff Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Mobile No:"+phone);
        System.out.println("Address:"+Address);
        System.out.println("Designation:"+Designation);
        System.out.println("Company Name::"+CompanyName);
        System.out.println("Salary:"+salary);
    }
    
}
