public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String vehicleNumber, String manufacturer, String model, double rentalRatePerDay, int numberOfDoors) {
        super(vehicleNumber, manufacturer, model, rentalRatePerDay);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public double calculateRentalCost(int days) {
        // Additional charge for cars with more than two doors
        if (numberOfDoors > 2) {
            return super.calculateRentalCost(days) + (35 * days);
        }
        return super.calculateRentalCost(days);
    }

    @Override
    public String toString() {
        return super.toString() + ", Number of Doors: " + numberOfDoors;
    }
}
