public class MainWeek13 {
    public static void main(String[] args) {
        // Create a diesel car object
        Car dieselCar = new Car(120, 50.0, 4, true);
        System.out.println("Testing Diesel Car:");
        dieselCar.start();
        dieselCar.displayFuel();
        dieselCar.honk();

        // Create a gasoline car object
        Car gasolineCar = new Car(150, 60.0, 2, false);
        System.out.println("\nTesting Gasoline Car:");
        gasolineCar.start();
        gasolineCar.displayFuel();
        gasolineCar.honk();
    


                        // Bicycle object
        Bicycle bicycle = new Bicycle(15, 0, true);
        System.out.println("\nTesting Bicycle:");
        bicycle.start();
        bicycle.displayFuel();
        bicycle.setHasBell(false);
        bicycle.hasBell();
    }
}
