
package bankmanagementsystem;

import java.util.Scanner;

public class Employee {

    String name;
    String age;
    final Double fixedSalary=8000.0;
    double eidBonus;
    double honourableBonus;
     double salary;
     Scanner input;

     public void inputAll(){
         
       input=new Scanner(System.in);
         System.out.println("Name:");
               
       name=input.nextLine();
       input.nextLine();
         System.out.println("Age:");
       age=input.nextLine();
       salary=0.0;
       eidBonus=0.0;
       honourableBonus=0.0;
     }
     
     public void eidBonus(double d){
         eidBonus=d;
     }
     public void honourableBonus(double h){
         honourableBonus=h;
     }
}
