package mentormanagementsystem;

public class Advisor extends Person{
    
    private int no_of_Student=0;
    
    public void AdvisorInfo(){
        PersonInfo();
    }
    
    public boolean AddStudents(){
        return no_of_Student<40;
    }
    
    public void IncreaseStudnet(){
        no_of_Student = no_of_Student++;
    }
    
    public Double ShowDue(double payable,double paid){
        return payable-paid;
    }
    
    public boolean ShowLowCGPAIDs(double cgpa){
        return cgpa<3.0;
    }
    
    public boolean ShowAbsentNames(int days){
        return days>10;
    }
    
    public String getAdvisorID(){
        return id;
    }
}
