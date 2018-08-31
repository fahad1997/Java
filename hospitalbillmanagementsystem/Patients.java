package hospitalbillmanagementsystem;

public class Patients extends Person implements PatientInterface{

    public String Contact_no;
    public String p_type;
    
    @Override
    public void PatientInfo() {
        PersonInfo();
        System.out.println("Conatct Number:");
        Contact_no = input.nextLine();
        System.out.println("Patient Type:");
        p_type = input.nextLine();
    }

    @Override
    public boolean checkPatientType(String patient) {

        return patient.equals("admitted");
    }

    @Override
    public String getName() {
        return Name;
    }

    @Override
    public String getType() {
        return p_type;
    }

    @Override
    public String getId() {
        return id;
    }
    
}
