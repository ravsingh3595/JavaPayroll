abstract public class Vehicle implements IPrintable{

    private String company;
    private String plate;
    private String colour;
    private int year;       //this is the new addition, need to be added over other methods also.

    public Vehicle()
    {

    }

    public Vehicle(String company, String plate, String colour, int year) {
        this.company = company;
        this.plate = plate;
        this.colour = colour;
        this.year = year;
    }

    public String getCompany()
    {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {

            this.year = year;
        }


    abstract public void Vehicle();

    @Override
    public void printMyData()
    {

    }

}
