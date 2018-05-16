package inheritance;

public class Customer extends Person{
    String customerType;
    String purchaseItem;
    
    public void customerInfo(){
        inputAll();
        System.out.println("Customer Type:");
        customerType=input.nextLine();
        System.out.println("Purcahse Item:");
        purchaseItem=input.nextLine();
    }
    public void cDisplay(){
        System.out.println("Customer Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Mobile No:"+phone);
        System.out.println("Address:"+Address);
        System.out.println("Customer Type:"+customerType);
        System.out.println("Purchase Item:"+purchaseItem);
    }
}
