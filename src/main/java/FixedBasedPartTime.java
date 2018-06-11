public class FixedBasedPartTime extends PartTime{

    private float fixedAmount;

    public FixedBasedPartTime()
    {
        super();
    }

    public FixedBasedPartTime(String name, int age, float rate, float hoursWorked, float fixedAmount) {
        super(name, age, rate, hoursWorked);
        this.fixedAmount = fixedAmount;
    }

    public float getFixedAmount() {
        return fixedAmount;
    }

    public void setFixedAmount(float fixedAmount) {
        this.fixedAmount = fixedAmount;
    }

    public float calEarnings()
    {
        return ((getRate()*getHoursWorked()) + getFixedAmount() + (getRate()*getHoursWorked()));
    }

    @Override
    public void printMyData()
    {
        System.out.println("Employee is PartTime/Fixed ");
        System.out.println("\tFixed Amount:   " + getFixedAmount());
        System.out.println("\tEarning:        " + calEarnings());
    }
}
