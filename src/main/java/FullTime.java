public class FullTime extends Employee {

    private float salary;
    private float bonus;

    public FullTime()
    {
        super();
    }

    public FullTime(String name, int age, float salary, float bonus) {
        super(name, age);
        this.salary = salary;
        this.bonus = bonus;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    public float calEarnings()
    {
        return (getSalary() + getBonus());
    }

    @Override
    public void printMyData()
    {
        System.out.println("Name:           " + getName());
        System.out.println("Year of Birth:  " + getCalBirthYear());
        System.out.println("Employee is FullTime");
        System.out.println("\tSalary:         " + getSalary());
        System.out.println("\tBonus:          " + getBonus());
        System.out.println("\tEarnings:       " + calEarnings());
    }
}