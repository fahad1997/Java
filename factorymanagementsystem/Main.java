package factorymanagementsystem;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println(".......Supervisor information.......");
        Supervisor sp = new Supervisor();
        
        System.out.println(".......Client Information.......");
        System.out.println("How many Client");
        int n=input.nextInt();
        input.nextLine();
        Client Cl[] = new Client[n];
        for(int i=0;i<n;i++)
        {
            Cl[i] = new Client();
            Cl[i].ClientInfo();
        }
        
        boolean runTime=true;
        
        while(runTime)
        {
             Order o = new Order();
             o.OrderInfo();
             
             if(o.checkShirt())
             {
                 System.out.println("Client ID:");
                 String c_id=input.nextLine();
                 boolean check=true;
                 int i=0;
                 while(i<n)
                 {
                     if(Cl[i].getClientID().equalsIgnoreCase(c_id))
                     {
                         Cl[i].setOrderID(o.Order_Id);
                         Cl[i].setAmountOfShirt(o.Order_Amount);
                         Cl[i].Bill(o.Order_Amount);
                         if(Cl[i].getClientType().equalsIgnoreCase("Registered"))
                         {
                             System.out.println("Client ID:"+Cl[i].getClientID());
                             System.out.println("Client Name:"+Cl[i].getClientName());
                             System.out.println("Order id:"+Cl[i].getOrderID());
                             System.out.println("Number of Shirts:"+Cl[i].getOrderAmount());
                         }
                     }
                     i++;
                 }
                 System.out.println("Do you want to continue[Y/N]:");
                 String s=input.nextLine();
                 runTime = s.equalsIgnoreCase("Y");
             }
             else
             {
                 runTime = false;
             }
        }
        
        System.out.println("How many Client Who is getting Discount:");
        int NumberOfClientGettingDiscount=input.nextInt();
        input.nextLine();
        int orderId[] = new int[NumberOfClientGettingDiscount];
        for(int j=0;j<NumberOfClientGettingDiscount;j++)
        {
            System.out.println("Enter Id:");
            orderId[j]=input.nextInt();
            input.nextLine();
        }
        
        int j=0,i=0;
        
        while(j<NumberOfClientGettingDiscount)
        {
            if(orderId[j]==Cl[i].getOrderID())
            {
                Cl[i].setBillWithDiscount();
                j++;
                i=-1;
            }
            i++;
        }
        
        while(i<n)
        {
            if(Cl[i].getClientType().equalsIgnoreCase("Registered"))
            {
                System.out.println("Client ID:"+Cl[i].getClientID());
                System.out.println("Client Name:"+Cl[i].getClientName());
                System.out.println("Order id:"+Cl[i].getOrderID());
                System.out.println("Number of Shirts:"+Cl[i].getOrderAmount());
                System.out.println("Bill:"+Cl[i].getBill());
            }
            i++;
        }
    } 
}