package meenabazar;

import java.util.Scanner;

public class MeenaBazar {

    
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        
        System.out.println("...........Salesman information................");
        System.out.println("How many Salesman:");
        int sm=input.nextInt();
        input.nextLine();
        Salesman sl[]=new Salesman[sm];
        for(int j=0;j<sm;j++)
        {
            sl[j] = new Salesman();
            sl[j].SalesManInfo();
        }
        
        System.out.println("............Customer Information...............");     
        System.out.println("How many Customer:");
        int c=input.nextInt();
        input.nextLine();
        Customer cs[] = new Customer[c];
        for(int k=0;k<c;k++)
        {
            cs[k]=new Customer();
            cs[k].CustomerInfo();
        }
        
        System.out.println("................Product Information..........");
        System.out.println("How many product:");
        int n=input.nextInt();
        input.nextLine();
        Product p[]=new Product[n];
        for(int i=0;i<n;i++)
        {
            p[i]=new Product();
            p[i].ProductInfo();
        }
        System.out.println("..........Shopping.............");
        for(int i=0;i<n;i++)
        {
            System.out.println("Product id:"+p[i].getId()+" "+"Productt name:"+p[i].getP_name());
            System.out.println("Product price:"+p[i].getPrice()+"  "+"Amount:"+p[i].getQuantity());
        }
        
        String NumberOfProductId[] = new String[n];
        System.out.println("How many Product you want:");
        int np=input.nextInt();
        input.nextLine();
        
        boolean forward=true;
        while(forward)
        {
        double total_price=0.0;
        for(int l=0;l<np;l++)
        {
            System.out.println("Product id:");
            NumberOfProductId[l]=input.nextLine();
            System.out.println("How many of this product you want:");
            int amount=input.nextInt();
            input.nextLine();
            boolean check=true;
            int i=0;
            while(check)
            {
                if(p[i].getId().equalsIgnoreCase(NumberOfProductId[l]))
                {
                    if(p[i].checkProduct(amount))
                    {
                        p[i].setQuantity(amount);
                        total_price=total_price+p[i].getPrice()*amount;
                        check=false;
                    }
                    else
                    {
                        System.out.println("The product is not available......");
                    }
                }
                i++;
            }
        }
        total_price=total_price+total_price*.02;
        System.out.println("Customer id:");
        String c_id=input.nextLine();
        boolean checkCustomerType=true;
        int k=0;
        while(checkCustomerType)
        {
            if(cs[k].getCustomerId().equalsIgnoreCase(c_id))
            {
                if(cs[k].getCustomerType().equalsIgnoreCase("Member"))
                {
                    total_price=total_price-cs[k].discount(total_price);
                    System.out.println("Total Bill:"+total_price);
                }
                else
                {
                    System.out.println("Total bill:"+total_price);
                }
                checkCustomerType=false;
            }
            k++;
        }
        
            System.out.println("Do you want to continue[Y/N]: ");
            String cont=input.nextLine();
            if(cont.equalsIgnoreCase("y"))
            {
                forward=true;
               for(int i=0;i<n;i++)
               {
                   System.out.println("Product id:"+p[i].getId()+" "+"Productt name:"+p[i].getP_name());
                   System.out.println("Product price:"+p[i].getPrice()+"  "+"Amount:"+p[i].getQuantity());
               }
            }
   }
    }
}
