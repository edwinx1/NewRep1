//Main class to run program
public class Runner {
    public static void main(String[] args) {
        //Create new object from HeroManagerClass
         HeroManagerClass HeroManagerClass = new HeroManagerClass();

 // Adding heroes from different ComicBooks
            HeroManagerClass.addHero(new HeroClass("Hulk", 100, Affiliation.AVENGERS));
            HeroManagerClass.addHero(new HeroClass("Batman", 85, Affiliation.JUSTICE_LEAGUE));
            HeroManagerClass.addHero(new HeroClass("Deadpool", 75, Affiliation.X_MEN));
            HeroManagerClass.addHero(new HeroClass("SilverSulfer", 100, Affiliation.FANTASTIC_FOUR));


   // Display original list
        System.out.println("Original List");
        HeroManagerClass.displayHeroes();

  // Sort by power level using Bubble Sort

        HeroManagerClass.bubbleSortbyPowerLevel();
        System.out.println("\nBubbleSort -PowerLevel");
        HeroManagerClass.displayHeroes();

    // Sort by power level using Insertion Sort
        HeroManagerClass.insertionSortbyPowerlevel();
        System.out.println("\nInsertionSort -PowerLevel");
        HeroManagerClass.displayHeroes();

 // Remove hero

        System.out.println("\nlist after removing batman");
        HeroManagerClass.removeHero("Batman");
        HeroManagerClass.displayHeroes();

    // Add hero
        System.out.println("\nlist after adding BlackWidow");
        HeroManagerClass.addHero(new HeroClass("BlackWidow", 70, Affiliation.AVENGERS));
        HeroManagerClass.displayHeroes();

    // Display heroes as 2D array
        System.out.println("\nDisplay Heroes as a 2D Array");
        HeroManagerClass.displayHeroesAs2DArray();
    }
}
