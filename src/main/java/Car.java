public class Car extends Vehicle {

    private float storageCapacity;
    private int seatCount;

    public Car(){
        super();
    }

    public Car(String company, String plate, String colour, int year, float storageCapacity, int seatCount) {
        super(company, plate, colour, year);
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

    public void Vehicle()
    {}

    @Override
    public void printMyData()
    {
        System.out.println("\tStore Space:    " + getStorageCapacity());
        System.out.println("\tNumber of Seats:" + getSeatCount());
    }
}
