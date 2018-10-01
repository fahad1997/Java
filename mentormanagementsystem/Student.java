package mentormanagementsystem;

public class Student extends Person{
    
    private int absent_days;
    private double cgpa;
    private double Payable;
    private double paid=0.0;
    public String Adv_id;
    
    public void StudentInfo(){
        PersonInfo();
        System.out.println("Cgpa Obtained:");
        cgpa = input.nextDouble();
        System.out.println("Payable:");
        Payable = input.nextDouble();
        System.out.println("Paid:");
        paid = input.nextDouble();
        System.out.println("Absent Days:");
        absent_days = input.nextInt();
        input.nextLine();
    }
    
    public String getName(){
        return name;
    }
    
    public String getID(){
        return id;
    }
    
    public String getContact(){
        return Contact_no;
    }
    
    public String getAdvisorID(){
        return Adv_id;
    }
    
    public double getCGPA(){
        return cgpa;
    }
    
    public double getPayable(){
        return Payable;
    }
    
    public double getPaid(){
        return paid;
    }
    
    public int getAbsentDays(){
        return absent_days;
    }
}
