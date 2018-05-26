package bankmanagementsystem;

public class BankManagementSystem {

    public static void main(String[] args) {

        Manager obj=new Manager();
        obj.inputAll();
        
        AccountHolder accobj=new AccountHolder();
        accobj.inputAll();
        double getAmmount=accobj.getBalance();
        
        AccountHolder accobj2=new AccountHolder();
        accobj2.inputAll();
        double getAmmount2=accobj2.getBalance();
        
        obj.salaryCalculation(getAmmount+getAmmount2);
    }
    
}
