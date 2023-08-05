public class Motorcycle extends Vehicle {
    private double engineCapacity;

    public Motorcycle(String vehicleNumber, String manufacturer, String model, double rentalRatePerDay, double engineCapacity) {
        super(vehicleNumber, manufacturer, model, rentalRatePerDay);
        this.engineCapacity = engineCapacity;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public double calculateTopSpeed() {
        return engineCapacity * 50;
    }

    @Override
    public double calculateRentalCost(int days) {
        if (calculateTopSpeed() >= 300) {
            return super.calculateRentalCost(days) + 150;
        }
        return super.calculateRentalCost(days);
    }

    @Override
    public String toString() {
        return super.toString() + ", Engine Capacity: " + engineCapacity;
    }
}
