package factorymanagementsystem;

import java.util.Scanner;

public class Person {

    public String id;
    public String name;
    Scanner input=new Scanner(System.in);
    
    public void PersonInfo(){
        System.out.println("Name:");
        name=input.nextLine();
        System.out.println("Id:");
        id=input.nextLine();
    }         
}
