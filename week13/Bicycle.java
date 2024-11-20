                            //bicycle class 
public class Bicycle extends Vehicle {
    private boolean hasBell; // Private to Bicycle

                            // Constructor to intialize cycle 
   public Bicycle(int speed, double fuel, boolean hasBell) {
        super(speed, fuel); // Call Vehicle's constructor
        this.hasBell = hasBell;
    }

                                // Override start method 
    @Override
    public void start() {
        System.out.println("You started Pedaling away!");
    }

                                // method for bicycle class only 
    public void hasBell() {
        if (hasBell) {
            System.out.println("Ring Ring!");
        } else {
            System.out.println("This bicycle has no bell.");
        }
    }

    // Getter and Setter for hasBell
    public boolean getHasBell() {
        return hasBell;
    }

    public void setHasBell(boolean hasBell) {
        this.hasBell = hasBell;
    }
}
