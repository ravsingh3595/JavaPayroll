public class Intern extends Employee {

    private String schoolName;

    public Intern()
    {
        super();
    }

    public Intern(String name, int age, String schoolName) {
        super(name, age);
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    float calEarnings()
    {
        return 1000;
    }

    @Override
    public void printMyData()
    {
        System.out.println("Employee is Intern");
        System.out.println("SchoolName:     " + getSchoolName());
        System.out.println("Earnings:       " + calEarnings());
    }
}
