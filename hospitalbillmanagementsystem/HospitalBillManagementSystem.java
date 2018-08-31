package hospitalbillmanagementsystem;

import java.util.Scanner;

public class HospitalBillManagementSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("...........Patients Information.........");
        System.out.println("How many Patients:");
        int NP= input.nextInt();
        input.nextLine();
        Patients p[] = new Patients[NP];
        for(int i=0;i<NP;i++)
        {
            p[i] = new Patients();
            p[i].PatientInfo();
        }
        
        System.out.println("...........Doctor's Information.........");
        System.out.println("How many Doctors:");
        int ND= input.nextInt();
        input.nextLine();
        Doctor d[] = new Doctor[ND];
        for(int j=0;j<ND;j++)
        {
            d[j] = new Doctor();
            d[j].DoctorInfo();
        }
        
        System.out.println("...........Diagnostic test Information.........");
        System.out.println("How many Diagnostic test:");
        int NDT= input.nextInt();
        input.nextLine();
        Diagnostics dt[] = new Diagnostics[NDT];
        for(int k=0;k<NDT;k++)
        {
            dt[k] = new Diagnostics();
            dt[k].DiagnosticInfo();
        }
        
        boolean runTime=true;
        
        System.out.println(".....Doctors Information.......");
        for(int j=0;j<ND;j++)
        {
            System.out.println("ID:"+d[j].getId()+"  Name:"+d[j].getName()+"  Department:"+d[j].department);
        }
        
        System.out.println("........Patients Information.......");
        for(int i=0;i<NP;i++)
        {
            System.out.println("ID:"+p[i].getId()+"  Name:"+p[i].getName()+"  Patient Type:"+p[i].getType());
        }
        
        while(runTime)
        {
            System.out.println("........Amitted Patients Information.......");
            for(int i=0;i<NP;i++)
            {
                if(p[i].getType().equalsIgnoreCase("admitted"))
                {
                   System.out.println("ID:"+p[i].getId()+"  Name:"+p[i].getName()+"  Patient Type:"+p[i].getType());
                }
            }
            
            System.out.println("Choose an id of Admitted Patient:");
            String ID= input.nextLine();
            System.out.println("......Diagnostic test Information.......");
            for(int k=0;k<NDT;k++)
            {
                System.out.println("Test id:"+dt[k].getDt_id()+"  Title:"+dt[k].getTitle()+"   Cost:"+dt[k].getCost());
            }
            double Bill=0.0;
            boolean runTime1 = true;
            while(runTime1)
            {
                System.out.println("Enter test ID:");
                String t_id = input.nextLine();
                for(int k=0;k<NDT;k++)
                {
                    if(t_id.equals(dt[k].getDt_id()))
                    {
                        Bill = Bill+dt[k].getCost();
                    }
                }
                System.out.println("For more tests press 'Y'");
                String cont = input.nextLine();
                runTime1 = cont.equalsIgnoreCase("y");
            }
            
            double total_bill;
            double dis;
            System.out.println("Doctors fees:");
            double df = input.nextDouble();
            System.out.println("Room fees:");
            double rf = input.nextDouble();
            Diagnostics dg = new Diagnostics();
            if(dg.checkDiscount(Bill))
            {
                dis = Bill - Bill*.1;
            }
            else
            {
                dis = Bill;
            }
            total_bill = dis + df + rf;
            
            System.out.println("Total Bill = "+total_bill);
            
            System.out.println("Do you want to continue?[y/n]");
            String conti = input.nextLine();
            runTime = conti.equalsIgnoreCase("y");
        }
    }
}
