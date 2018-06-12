abstract public class Vehicle {

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

    public String getCompany() {
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

    public void printMyData()
    {
        System.out.println("Employee has a  ");                     //how to order the lines because this data will come fro the other class
        System.out.println("\tBrand:          " + getCompany());
        System.out.println("\tVehicle Number: " + getPlate());
        System.out.println("\tColour:         " + getColour());
        System.out.println("\tManufactured Year:" + getYear());
    }

}
