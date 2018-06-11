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

    float calEarnings(){
        return ((getRate()*getHoursWorked()) + commissionPercentage);
    }
    public void printMyData()
    {
        System.out.println("Name:           " + getName());
        System.out.println("Year of Birth : " + calBirthYear());
        System.out.println("Employee is PartTime/Commissioned ");
        System.out.println("Rate:           " + getRate());
        System.out.println("Hours Worked:   " + getHoursWorked());
        System.out.println("Commission:     " + getCommissionPercentage());



    }

}
