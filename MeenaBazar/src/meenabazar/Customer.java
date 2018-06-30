package meenabazar;


public class Customer extends person{
    
    public String C_type;
    
    public void CustomerInfo(){
        
        personInfo();
        System.out.println("Cuatomer Type:");
        C_type=input.nextLine();
    }
    
    public String getCustomerType(){
        return C_type;
    }
    
    public String getCustomerId(){
        return id;
    }
    
    public double discount(double dis){
        return dis*.05;
    }
}
