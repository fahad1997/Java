package bankmanagementsystem;

import java.util.Scanner;

public class AccountHolder {

    private String AccountNumber;
    private String Name;
    private double balance=0.0;
    private double deposite_amount=0.0;
    private double widrow_amount;
    final double interest=.1;
    private double loan;
    private String id;
    
    Scanner input=new Scanner(System.in);
    
    public void inputAll(){
        System.out.println("Account Number:");
        AccountNumber=input.nextLine();
        System.out.println("Name:");
        Name=input.nextLine();
        System.out.println("Balance:");
        balance=input.nextDouble();
        
        deposite_amount=0.0;
        widrow_amount=0.0;

    }
    
    public void depositeAmount(){
        System.out.println("Deposite Money:");
        deposite_amount=input.nextDouble();
        balance+=deposite_amount;
    }
    
    public void widrow(){
        System.out.println("Withdraw Amount:");
        widrow_amount=input.nextDouble();
        if(balance>widrow_amount){
        balance-=widrow_amount;
        }
        else
        {
            System.out.println("You have not sufficient balance....");
        }
    }
    
    public void interest(){
        balance=balance*interest;
    }
    
    public boolean checkLoan(){
        return balance>500.0;
    }
    
    public void inputloan(double l){
        if(checkLoan())
        {
            balance+=l;
        }
        else
        {
            System.out.println("You are not eligible for loan...");
        }
    }
    public double getBalance(){
           double b=10000.0;
           return b;
    }
}
