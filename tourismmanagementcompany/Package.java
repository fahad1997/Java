package tourismmanagementcompany;

import java.util.Scanner;

public class Package {
    
    public String pac_id;
    public String pac_name;
    public double pac_price;
    public int pac_seatCapasity=10;
    Scanner input = new Scanner(System.in);
    
    public void PackageInfo(){
        System.out.println("Package ID:");
        pac_id = input.nextLine();
        System.out.println("Package Name:");
        pac_name = input.nextLine();
        System.out.println("Package price per person:");
        pac_price = input.nextDouble();
        input.nextLine();
    }
    
    public void setSeatCapasity(int seatLeft){
        pac_seatCapasity = pac_seatCapasity-seatLeft;
    }
    
    public boolean checkSeatAvailability(int seat){
        if(seat<pac_seatCapasity)
        {
            return true;
        }
        else
        {
            System.out.println("Seat is not available");
            return false;
        }
    }
    
    public String getSPackID(){
        return pac_id;
    }
    
    public String getSPackName(){
        return pac_name;
    }
    
    public double getSPackPrice(){
        return pac_price;
    }
    
    public int getSPackSeatCapacity(){
        return pac_seatCapasity;
    }
}
