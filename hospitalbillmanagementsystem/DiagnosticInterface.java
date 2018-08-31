package hospitalbillmanagementsystem;

public interface DiagnosticInterface {

    public void DiagnosticInfo();
    public String getDt_id();
    public String getTitle();
    public Double getCost();
    public boolean checkDiscount(double d);
}
