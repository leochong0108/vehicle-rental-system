public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[4];
        vehicles[0] = new Car("JWA4207", "Toyota", "Corolla", 100, 4);
        vehicles[1] = new Car("JWA4206", "Honda", "Civic Type-R", 120, 2);
        vehicles[2] = new Motorcycle("JWA4208", "Yamaha", "YZF-R6", 80, 600);
        vehicles[3] = new Motorcycle("JWA4205", "Kawasaki", "Ninja 650", 90, 650);

        int rentalDays = 5;

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.toString());
            System.out.println("Rental Cost for " + rentalDays + " days: RM " + vehicle.calculateRentalCost(rentalDays));
            if (vehicle instanceof Motorcycle) {
                System.out.println("Top Speed: " + ((Motorcycle) vehicle).calculateTopSpeed() + " km/h");
            }
            System.out.println();
        }
    }
}
