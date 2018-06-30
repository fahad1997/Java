package meenabazar;

import java.util.Scanner;

public class person {
    
    public String Name;
    public String id;
    Scanner input= new Scanner(System.in);
    
    public void personInfo(){
        System.out.println("Name:");
        Name=input.nextLine();
        System.out.println("id:");
        id=input.nextLine();
    }
}
