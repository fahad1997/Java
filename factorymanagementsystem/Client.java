package factorymanagementsystem;

public class Client extends Person{
    
    private String C_type;
    private int order_id;
    private int AmountOfOrder;
    private final double shirt=200.0;
    private double bill;
    public boolean checkShirt=true;
    
    public void ClientInfo(){
        PersonInfo();
        System.out.println("Client Type:");
        C_type=input.nextLine();
    }
    
    
    public void Bill(double as){
        bill = shirt*as+(shirt*as*.05);
    }
    
    public int getOrderAmount(){
        return AmountOfOrder;
    }
    
    public int getOrderID(){
        return order_id;
    }
    
    public double getBill(){
        return bill;
    }
    
    public String getClientID(){
        return id;
    }
    
    public String getClientType(){
        return C_type;
    }
    
    public String getClientName(){
        return name;
    }
    
    public void setAmountOfShirt(int as){
        AmountOfOrder=as;
    }  
    
    public void setOrderID(int s){
        order_id = s;
    }
  
    public void setBillWithDiscount(){
        bill=bill-bill*.1;
    }
}
