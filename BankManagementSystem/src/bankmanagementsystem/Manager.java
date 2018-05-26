package bankmanagementsystem;

public class Manager extends Employee{
    final double bonusRate=0.07;
    
    public void salaryCalculation(double allAmount)
    {
        salary=fixedSalary+honourableBonus+(allAmount*bonusRate);
        System.out.println("Salary:"+salary);
    }
}
