public class Vehicle {

    //private String type;
    private String company;
    private String plate;
    private String colour;

    public Vehicle()
    {

    }

    public Vehicle(String company, String plate, String colour) {
        this.company = company;
        this.plate = plate;
        this.colour = colour;
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
}
