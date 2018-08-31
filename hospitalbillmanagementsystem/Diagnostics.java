package hospitalbillmanagementsystem;

import java.util.Scanner;

public class Diagnostics implements DiagnosticInterface{

    public String title;
    public String dt_id;
    public Double cost;
    
    Scanner input= new Scanner(System.in);

    @Override
    public void DiagnosticInfo() {
        System.out.println("Test ID:");
        dt_id = input.nextLine();
        System.out.println("Test item name:");
        title = input.nextLine();
        System.out.println("Cost:");
        cost = input.nextDouble();
    }

    @Override
    public String getDt_id() {
        return dt_id;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public Double getCost() {
        return cost;
    }

    @Override
    public boolean checkDiscount(double d) {
        return d>2000;
    }  
}
