// SuperHeroes main Method 
public class SuperHeroesRoster {

    public static void main(String[] args) {
        // declare and initialize arrays for hero names, abilities, and power levels
        String[] heroNames = {"Hulk", "Captain A", "Hawkeye"};
        String[] abilities = {"super strenght", "Super Soldier", "bow and arrow deadshot"};
        int[] powerLevels = {100, 90, 80};

        // print each hero's details using a loop
        System.out.println("Superhero Details:");
        for (int i = 0; i < heroNames.length; i++) {
            System.out.println("Name: " + heroNames[i] + ", Ability: " + abilities[i] + ", Power Level: " + powerLevels[i]);
        }

        // call the searchHero method to find a specific hero by name
        String HeroFound = "Hulk";
        searchHero(heroNames, abilities, powerLevels, HeroFound);

        //  calculate and display the average power level by calling calculateAveragePower method
        double averagePower = calculateAvgPower(powerLevels);
        System.out.println("Avg Power Level: " + averagePower);

        // create an array of Superhero objects and populate it with sample heroes
        Superhero[] heroes = new Superhero[heroNames.length];
        for (int i = 0; i < heroNames.length; i++) {
            heroes[i] = new Superhero(heroNames[i], abilities[i], powerLevels[i]);
        }

        // Superhero class's displayHero method
        System.out.println("\nSuperhero Class Details:");
        for (Superhero hero : heroes) {
            hero.displayHero();
        }
    }
         // This is the searchHero Method
    public static void searchHero(String[] names, String[] abilities, int[] powerLevels, String target) {
        boolean found = false;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(target)) {
                System.out.println("\nHero Found:");
                System.out.println("Name: " + names[i] + ", Ability: " + abilities[i] + ", Power Level: " + powerLevels[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("\nHero not found");
        }
    }

    // This is the calculateAvgPower Method
  public static double calculateAvgPower(int[] powerLevels) {
        int sum = 0;
        for (int power : powerLevels) {
            sum += power;
        }
        return (double) sum / powerLevels.length;
    }

}

    //Super Hero Class
    class Superhero {
    String name;
    String ability;
    int powerLevel;

    // Constructor to initialize name, ability, and powerLevel
    public Superhero(String name, String ability, int powerLevel) {
        this.name = name;
        this.ability = ability;
        this.powerLevel = powerLevel;
    }

    // Method to display the hero's details
    public void displayHero() {
        System.out.println("Name: " + name + ", Ability: " + ability + ", Power Level: " + powerLevel);
    }
    }
