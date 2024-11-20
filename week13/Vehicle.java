public class Vehicle {
    protected int speed; // Protected so subclasses can access
    private double fuel; // Private for encapsulation

    // Constructor
    public Vehicle(int speed, double fuel) {
        this.speed = speed;
        this.fuel = fuel;
    }

                            // start method
    public void start() {
        System.out.println("The vehicle has started.");
    }

                                // Stop method
    public void stop() {
        System.out.println("The vehicle has stopped.");
    }

                         // Final method to display fuel level
    public final void displayFuel() {
        System.out.println("Fuel level: " + fuel);
    }

                                // Getter and Setter for speed
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // Getter and Setter for fuel
    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }
}
