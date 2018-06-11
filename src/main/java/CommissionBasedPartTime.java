public class CommissionBasedPartTime extends PartTime {

    private float commissionPercentage;

    public CommissionBasedPartTime()
    {
        super();
    }

    public CommissionBasedPartTime(String name, int age, float rate, float hoursWorked, float commissionPercentage) {
        super(name, age, rate, hoursWorked);
        this.commissionPercentage = commissionPercentage;
    }

    public float getCommissionPercentage() {
        return commissionPercentage;
    }

    public void setCommissionPercentage(float commissionPercentage) {
        this.commissionPercentage = commissionPercentage;
    }

    public float calEarnings(){
        return ((getRate()*getHoursWorked()) + ((commissionPercentage/100) *(getRate()*getHoursWorked())));
    }
    @Override
    public void printMyData()
    {
        System.out.println("Employee is PartTime/Commissioned ");
        System.out.println("\tCommission:     " + getCommissionPercentage() +"%");
        System.out.println("\tEarning:        " + calEarnings());
    }

}
