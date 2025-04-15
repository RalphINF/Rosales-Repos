import java.util.Scanner;


class Vehicle {
    private String brand;
    private int speed;
    private String fuelType;

    public Vehicle(String brand, int speed, String fuelType) {
        this.brand = brand;
        this.speed = speed;
        this.fuelType = fuelType;
    }

    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Fuel Type: " + fuelType);
    }
}

// Car subclass
class Car extends Vehicle {
    private int numDoors;

    public Car(String brand, int speed, String fuelType, int numDoors) {
        super(brand, speed, fuelType);
        this.numDoors = numDoors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + numDoors);
    }
}


class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String brand, int speed, String fuelType, boolean hasSidecar) {
        super(brand, speed, fuelType);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has Sidecar: " + (hasSidecar ? "Yes" : "No"));
    }
}

// Main class
public class TestVehicles {
    public static void main(String[] args) {
        Scanner Ralph = new Scanner(System.in);

        // Input for Car
        System.out.println("Enter Car Details:");
        System.out.print("Brand: ");
        String carBrand = Ralph.nextLine();
        System.out.print("Speed: ");
        int carSpeed = Ralph.nextInt();
        Ralph.nextLine(); // consume newline
        System.out.print("Fuel Type: ");
        String carFuel = Ralph.nextLine();
        System.out.print("Number of Doors: ");
        int carDoors = Ralph.nextInt();
        Ralph.nextLine(); // consume newline

        // Input for Motorcycle
        System.out.println("\nEnter Motorcycle Details:");
        System.out.print("Brand: ");
        String motoBrand = Ralph.nextLine();
        System.out.print("Speed: ");
        int motoSpeed = Ralph.nextInt();
        Ralph.nextLine(); // consume newline
        System.out.print("Fuel Type: ");
        String motoFuel = Ralph.nextLine();
        System.out.print("Has Sidecar (true/false): ");
        boolean hasSidecar = Ralph.nextBoolean();

        // Create objects
        Car car = new Car(carBrand, carSpeed, carFuel, carDoors);
        Motorcycle motorcycle = new Motorcycle(motoBrand, motoSpeed, motoFuel, hasSidecar);

        // Display info
        System.out.println("\nCar Information:");
        car.displayInfo();

        System.out.println("\nMotorcycle Information:");
        motorcycle.displayInfo();

        Ralph.close();
        
    }
}
