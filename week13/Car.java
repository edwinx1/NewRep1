                            //car class extending from vehicle class
public class Car extends Vehicle {
    public int numberOfDoors;
    public boolean isDiesel; // Private to Car

                          // Constructor
    public Car(int speed, double fuel, int numberOfDoors, boolean isDiesel) {
        super(speed, fuel); // Call Vehicle's constructor
        this.numberOfDoors = numberOfDoors;
        this.isDiesel = isDiesel;
    }

                 // Override start method to display specific message for car only
    @Override
    public void start() {
        System.out.println("Vroom Vroom!");
        // Optionally call the Vehicle's start method
        // super.start();
    }
    // new method for car clas
       public void isDiesel() {
        if (isDiesel = true ) {
            System.out.println("Car runs on diesel!");
        } else {
            System.out.println("Car runs on gasoline!");
        }
    }

     public boolean getIsDiesel(){
        return isDiesel;
    }

    public void setIsDiesel(boolean isDiesel) {
        this.isDiesel = isDiesel;
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
