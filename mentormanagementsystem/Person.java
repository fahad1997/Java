package mentormanagementsystem;

import java.util.Scanner;

public class Person {

    public String id;
    public String name;
    public String Contact_no;
    Scanner input = new Scanner(System.in);

    public void PersonInfo(){
        System.out.println("ID:");
        id=input.nextLine();
        System.out.println("Name:");
        name=input.nextLine();
        System.out.println("Contact Number:");   
        Contact_no = input.nextLine();
    }       
}
