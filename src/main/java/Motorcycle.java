public class Motorcycle extends Vehicle{

    float enginePower;
    float topSpeed;

    public void Vehicle()
    {

    }
    public Motorcycle(){
        super();
    }

    public Motorcycle(String company, String plate, String colour, float enginePower, float topSpeed) {
        super(company, plate, colour);
        this.enginePower = enginePower;
        this.topSpeed = topSpeed;
    }

    public float getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(float enginePower) {
        this.enginePower = enginePower;
    }

    public float getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(float topSpeed) {
        this.topSpeed = topSpeed;
    }
}
