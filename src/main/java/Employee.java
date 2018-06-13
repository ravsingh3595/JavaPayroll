abstract public class Employee {

    private String name;
    private int age;

    public Employee()
    {

    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCalBirthYear(int age)
    {
        this.age = age;
    }

    public int getCalBirthYear()
    {
        return (2018-age);
    }

    Vehicle v1 = new Car();
    Vehicle v2 = new Motorcycle();

    abstract public float calEarnings();
    /* {
        return (1000f);
    }*/

    public void printMyData()
    {

    }

}
