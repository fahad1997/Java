package inheritance;

import java.util.Scanner;

public class Person {

    String name;
    String age;
    String phone;
    String Address;
    Scanner input=new Scanner(System.in);
    public void inputAll(){
        System.out.println("Name:");
        name=input.nextLine();
        System.out.println("Age:");
        age=input.nextLine();
        System.out.println("Mobile number:");
        phone=input.nextLine();
        System.out.println("Address:");
        Address=input.nextLine();
    }
}
