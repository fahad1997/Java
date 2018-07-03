package factorymanagementsystem;

import java.util.Scanner;

public class Order {

    public int Order_Id;
    public int Order_Amount;
    Scanner input=new Scanner(System.in);
    
    public void OrderInfo(){
        System.out.println("Order Id:");
        Order_Id=input.nextInt();
        input.nextLine();
        System.out.println("How many Shirts You Want:");
        Order_Amount=input.nextInt();
        checkShirt();
        input.nextLine();
    }
    
    public boolean checkShirt(){
        return Order_Amount>5000;
    }
}
