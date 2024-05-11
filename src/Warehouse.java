package pl.pp;

public class Warehouse {

    private int warehouseNumber;
    private int availableSpace;
    private String ownerName;
    private String ownerEmail;
    private String ownerPhoneNumber;

    public Warehouse(int warehouseNumber, int availableSpace, String ownerName, String ownerEmail, String ownerPhoneNumber) {
        this.warehouseNumber = warehouseNumber;
        this.availableSpace = availableSpace;
        this.ownerName = ownerName;
        this.ownerEmail = ownerEmail;
        this.ownerPhoneNumber = ownerPhoneNumber;
    }

    // Getters and setters
    public int getWarehouseNumber() {
        return warehouseNumber;
    }

    public void setWarehouseNumber(int warehouseNumber) {
        this.warehouseNumber = warehouseNumber;
    }

    public int getAvailableSpace() {
        return availableSpace;
    }

    public void setAvailableSpace(int availableSpace) {
        this.availableSpace = availableSpace;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerEmail() {
        return ownerEmail;
    }

    public void setOwnerEmail(String ownerEmail) {
        this.ownerEmail = ownerEmail;
    }

    public String getOwnerPhoneNumber() {
        return ownerPhoneNumber;
    }

    public void setOwnerPhoneNumber(String ownerPhoneNumber) {
        this.ownerPhoneNumber = ownerPhoneNumber;
    }

    // Method to add goods to the warehouse
    public void addGoods(int units) {
        if (units <= availableSpace) {
            availableSpace -= units;
            System.out.println("Added " + units + " units of goods. Remaining warehouse space: " + availableSpace + " units.");
        } else {
            System.out.println("Not enough space in the warehouse. Remaining warehouse space: " + availableSpace + " units.");
        }
    }

    // Method to remove goods from the warehouse
    public void removeGoods(int units) {
        if (units <= (5000 - availableSpace)) {
            availableSpace += units;
            System.out.println("Removed " + units + " units of goods. Remaining warehouse space: " + availableSpace + " units.");
        } else {
            System.out.println("Not enough goods in the warehouse.");
        }
    }

    // Method to check occupancy of the warehouse
    public void checkOccupancy() {
        int occupiedSpace = 5000 - availableSpace;
        System.out.println("Occupied warehouse space: " + occupiedSpace + " units.");
        System.out.println("Available warehouse space: " + availableSpace + " units.");
    }

    // Method to update owner's contact details
    public void updateContact(String newEmail, String newPhoneNumber) {
        ownerEmail = newEmail;
        ownerPhoneNumber = newPhoneNumber;
        System.out.println("Owner's contact details updated.");
        System.out.println("New email: " + ownerEmail);
        System.out.println("New phone number: " + ownerPhoneNumber);
    }

    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse(1234, 5000, "Default Owner", "owner@example.com", "+48 123 456 789");
        warehouse.addGoods(3000);
        warehouse.removeGoods(1000);
        warehouse.addGoods(2500);
        warehouse.checkOccupancy();
        warehouse.updateContact("owner@magazyn.pl", "+48 123 456 789");
        warehouse.addGoods(500);
    }
}
