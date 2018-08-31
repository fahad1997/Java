package hospitalbillmanagementsystem;

import java.util.Scanner;

public class Person implements PersonInterface{

    public String Name;
    public String Age;
    public String id;
    
    Scanner input = new Scanner(System.in);

    @Override
    public void PersonInfo() {
        System.out.println("ID:");
        id = input.nextLine();
        System.out.println("Name:");
        Name = input.nextLine();
        System.out.println("Age:");
        Age = input.nextLine();
    }
}
