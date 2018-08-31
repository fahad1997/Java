package hospitalbillmanagementsystem;

public class Doctor extends Person implements DoctorInterface{

    public String department;
    public String degree;

    @Override
    public void DoctorInfo() {
        PersonInfo();
        System.out.println("Department:");
        department = input.nextLine();
        System.out.println("Degree:");
        degree = input.nextLine();
    }   

    @Override
    public String getName() {
        return Name;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getDept() {
        return department;
    }
}
