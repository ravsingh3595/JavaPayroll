public class Car extends Vehicle {

    float storageCapacity;
    int seatCount;

    public Car(){
        super();
    }

    public Car(String company, String plate, String colour, float storageCapacity, int seatCount) {
        super(company, plate, colour);
        this.storageCapacity = storageCapacity;
        this.seatCount = seatCount;
    }

    public float getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(float storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }
}
