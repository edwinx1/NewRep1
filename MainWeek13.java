public class MainWeek13 {
    public static void main(String[] args) {
        // Create a Car object
        Car car = new Car(120, 50.0, 4);
        System.out.println("Testing Car:");
        car.start();
        car.displayFuel();
        car.honk();

        // Create a Bicycle object
        Bicycle bicycle = new Bicycle(15, 0.0, true);
        System.out.println("\nTesting Bicycle:");
        bicycle.start();
        bicycle.displayFuel();
        bicycle.ringBell();
    }
}
