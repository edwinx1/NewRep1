                            //car class extending from vehicle class
public class Car extends Vehicle {
    private int numberOfDoors; // Private to Car

                          // Constructor
    public Car(int speed, double fuel, int numberOfDoors) {
        super(speed, fuel); // Call Vehicle's constructor
        this.numberOfDoors = numberOfDoors;
    }

                 // Override start method to display specific message for car only
    @Override
    public void start() {
        System.out.println("Vroom Vroom!");
        // Optionally call the Vehicle's start method
        // super.start();
    }

                          // specific method for car class
    public void honk() {
        System.out.println("Beep Beep!");
    }

    // Getter and Setter for numberOfDoors
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
