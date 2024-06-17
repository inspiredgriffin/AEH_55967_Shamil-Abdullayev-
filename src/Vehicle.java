// Abstract Class Vehicle
public abstract class Vehicle {
    private String registrationNumber;
    private String vinNumber;
    private String color;
    private double price;
    private double fuelConsumption;
    private double fuelLevel;
    private double mileage;

    public Vehicle(String registrationNumber, String vinNumber, String color, double price, double fuelConsumption, double fuelLevel, double mileage) {
        this.registrationNumber = registrationNumber;
        this.vinNumber = vinNumber;
        this.color = color;
        this.price = price;
        this.fuelConsumption = fuelConsumption;
        this.fuelLevel = fuelLevel;
        this.mileage = mileage;
    }

    public abstract void drive(double distance);
    public abstract void refuel(double fuel);

    // Getters and Setters
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(String vinNumber) {
        this.vinNumber = vinNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }
}

// FuelType Interface
interface FuelType {
    String getFuelType();
}

// Implementations of FuelType Interface
class Diesel implements FuelType {
    @Override
    public String getFuelType() {
        return "Diesel";
    }
}

class Gasoline implements FuelType {
    @Override
    public String getFuelType() {
        return "Gasoline";
    }
}

class Electric implements FuelType {
    @Override
    public String getFuelType() {
        return "Electric";
    }
}

// PassengerCar Class
class PassengerCar extends Vehicle {
    private int numberOfDoors;

    public PassengerCar(String registrationNumber, String vinNumber, String color, double price, double fuelConsumption, double fuelLevel, double mileage, int numberOfDoors) {
        super(registrationNumber, vinNumber, color, price, fuelConsumption, fuelLevel, mileage);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void drive(double distance) {
        double neededFuel = distance * getFuelConsumption() / 100;
        if (neededFuel <= getFuelLevel()) {
            setMileage(getMileage() + distance);
            setFuelLevel(getFuelLevel() - neededFuel);
        } else {
            System.out.println("Not enough fuel to drive the distance.");
        }
    }

    @Override
    public void refuel(double fuel) {
        setFuelLevel(getFuelLevel() + fuel);
    }

    // Getters and Setters
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}

// Truck Class
class Truck extends Vehicle {
    private double loadCapacity;

    public Truck(String registrationNumber, String vinNumber, String color, double price, double fuelConsumption, double fuelLevel, double mileage, double loadCapacity) {
        super(registrationNumber, vinNumber, color, price, fuelConsumption, fuelLevel, mileage);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void drive(double distance) {
        double neededFuel = distance * getFuelConsumption() / 100;
        if (neededFuel <= getFuelLevel()) {
            setMileage(getMileage() + distance);
            setFuelLevel(getFuelLevel() - neededFuel);
        } else {
            System.out.println("Not enough fuel to drive the distance.");
        }
    }

    @Override
    public void refuel(double fuel) {
        setFuelLevel(getFuelLevel() + fuel);
    }

    // Getters and Setters
    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}

// Motorcycle Class
class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String registrationNumber, String vinNumber, String color, double price, double fuelConsumption, double fuelLevel, double mileage, boolean hasSidecar) {
        super(registrationNumber, vinNumber, color, price, fuelConsumption, fuelLevel, mileage);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void drive(double distance) {
        double neededFuel = distance * getFuelConsumption() / 100;
        if (neededFuel <= getFuelLevel()) {
            setMileage(getMileage() + distance);
            setFuelLevel(getFuelLevel() - neededFuel);
        } else {
            System.out.println("Not enough fuel to drive the distance.");
        }
    }

    @Override
    public void refuel(double fuel) {
        setFuelLevel(getFuelLevel() + fuel);
    }

    // Getters and Setters
    public boolean isHasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }
}

// ConstructionEquipment Class
class ConstructionEquipment extends Vehicle {
    private int hoursWorked;

    public ConstructionEquipment(String registrationNumber, String vinNumber, String color, double price, double fuelConsumption, double fuelLevel, double mileage, int hoursWorked) {
        super(registrationNumber, vinNumber, color, price, fuelConsumption, fuelLevel, mileage);
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void drive(double distance) {
        double neededFuel = distance * getFuelConsumption() / 100;
        if (neededFuel <= getFuelLevel()) {
            setMileage(getMileage() + distance);
            setFuelLevel(getFuelLevel() - neededFuel);
        } else {
            System.out.println("Not enough fuel to drive the distance.");
        }
    }

    @Override
    public void refuel(double fuel) {
        setFuelLevel(getFuelLevel() + fuel);
    }

    // Getters and Setters
    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}

// Test Class
class RentalTest {
    public static void main(String[] args) {
        FuelType diesel = new Diesel();
        FuelType gasoline = new Gasoline();
        FuelType electric = new Electric();

        PassengerCar car = new PassengerCar("ABC123", "VIN001", "Red", 20000, 8, 50, 10000, 4);
        Truck truck = new Truck("DEF456", "VIN002", "Blue", 50000, 15, 70, 50000, 2000);
        Motorcycle motorcycle = new Motorcycle("GHI789", "VIN003", "Black", 15000, 5, 20, 2000, true);
        ConstructionEquipment equipment = new ConstructionEquipment("JKL012", "VIN004", "Yellow", 80000, 20, 100, 3000, 150);

        System.out.println("Driving the car for 100 km.");
        car.drive(100);
        System.out.println("Fuel level after driving: " + car.getFuelLevel());

        System.out.println("Refueling the truck with 50 liters.");
        truck.refuel(50);
        System.out.println("Fuel level after refueling: " + truck.getFuelLevel());

        System.out.println("Driving the motorcycle for 50 km.");
        motorcycle.drive(50);
        System.out.println("Fuel level after driving: " + motorcycle.getFuelLevel());

        System.out.println("Driving the construction equipment for 200 km.");
        equipment.drive(200);
        System.out.println("Fuel level after driving: " + equipment.getFuelLevel());
    }
}