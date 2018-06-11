abstract public class PartTime extends Employee {

    private float rate;
    private float hoursWorked;

    public PartTime()
    {
        super();
    }

    public PartTime(String name, int age, float rate, float hoursWorked) {
        super(name, age);
        this.rate = rate;
        this.hoursWorked = hoursWorked;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public float getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(float hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    abstract float calEarnings();

    @Override
    public void printMyData()
    {
        System.out.println("Rate:           " + getRate());
        System.out.println("Hours Worked:   " + getHoursWorked());
    }
}
