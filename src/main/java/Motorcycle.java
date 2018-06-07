public class Motorcycle extends Vehicle{

    float enginePower;
    float topSpeed;

    public Motorcycle(float enginePower, float topSpeed) {
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
