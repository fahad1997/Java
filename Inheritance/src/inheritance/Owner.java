package inheritance;

public class Owner extends Person {

    String Designation;
    String CompanyName;
    
    public void ownerInfo(){
        inputAll();
        System.out.println("Designation:");
        Designation=input.nextLine();
        System.out.println("Company Name:");
        CompanyName=input.nextLine();
    }
    public void oDisplay(){
        System.out.println("Owner Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Mobile No:"+phone);
        System.out.println("Address:"+Address);
        System.out.println("Designation:"+Designation);
        System.out.println("Company Name::"+CompanyName);
    }
}
