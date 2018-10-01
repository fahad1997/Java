package mentormanagementsystem;

import java.util.Scanner;

public class MentorManagementSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        
        System.out.println("...........Advisor Information.........");
        System.out.println("How many Advisor:");
        int ad = input.nextInt();
        input.nextLine();
        Advisor adv[] = new Advisor[ad];
        for(int i=0;i<ad;i++)
        {
            adv[i] = new Advisor();
            adv[i].AdvisorInfo();
        }
        
        System.out.println(".......Student Information......");
        System.out.println("How many Students:");
        int s = input.nextInt();
        input.nextLine();
        Student st[] = new Student[s];
        for(int j=0;j<s;j++)
        {
            st[j] = new Student();
            System.out.println("Advisor ID:");
            st[j].Adv_id = input.nextLine();
            for(int i=0;i<ad;i++)
            {
                if(st[j].Adv_id.equals(adv[i].getAdvisorID()))
                {
                    if(adv[i].AddStudents())
                    {
                        adv[i].IncreaseStudnet();
                        st[j].StudentInfo();
                    }
                    else
                    {
                        System.out.println("Seat is not available...");
                        j--;
                    }
                }
            }
        }
        
        System.out.println("Enter Advisor ID:");
        String ad_id = input.nextLine();
        System.out.println("......All students Information under your advising....");
        for(int j=0;j<s;j++)
        {
            if(ad_id.equals(st[j].getAdvisorID()))
            {
                System.out.println("Student Name:"+st[j].getName());
                System.out.println("Student ID:"+st[j].getID());
                System.out.println("Cont. No:"+st[j].getContact());
                System.out.println("CGPA:"+st[j].getCGPA());
                System.out.println("Payable:"+st[j].getPayable());
                System.out.println("Paid:"+st[j].getPaid());
                System.out.println("Absent Days:"+st[j].getAbsentDays());
            }
        }
        
        Advisor a = new Advisor();
        System.out.println("......Show Due......");
        for(int j=0;j<s;j++)
        {
            if(ad_id.equals(st[j].getAdvisorID()))
            {
                double payable = st[j].getPayable();
                double paid = st[j].getPaid();
                double due = a.ShowDue(payable, paid);
                System.out.println("ID:"+st[j].getID()+"   "+"Due is:"+due);
            }
        }
        
        System.out.println("......Show Low CGPA ID......");
        for(int j=0;j<s;j++)
        {
            if(ad_id.equals(st[j].getAdvisorID()))
            {
                double cgpa = st[j].getCGPA();
                if(a.ShowLowCGPAIDs(cgpa))
                {
                    System.out.println("ID:"+st[j].getID()+"   "+"CGPA:"+st[j].getCGPA());
                }
            }
        }
        
        System.out.println("......Absent More than 10 Days......");
        for(int j=0;j<s;j++)
        {
            if(ad_id.equals(st[j].getAdvisorID()))
            {
                int days = st[j].getAbsentDays();
                if(a.ShowAbsentNames(days))
                {
                    System.out.println("Name:"+st[j].getName()+"   "+"Absent Days:"+st[j].getAbsentDays());
                }
            }
        }              
    }  
}
