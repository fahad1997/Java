package bankmanagementsystem;

public class Accountant extends Employee{
    final double bonusRate=0.03;
    
    public void salaryCalculation(double allAmount)
    {
        salary=fixedSalary+honourableBonus+(allAmount*bonusRate);
    }
}
