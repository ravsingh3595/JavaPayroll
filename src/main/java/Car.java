public class Car extends Vehicle {

    float storageCapacity;
    int seatCount;

    public Car(float storageCapacity, int seatCount) {
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
