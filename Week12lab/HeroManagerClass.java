//import arraylist and array packages
import java.util.ArrayList;
import java.util.Arrays;
//Hero manager class create arraylist from Heroclass
public class HeroManagerClass {
         private ArrayList<HeroClass> heroes;
             // Constructor to initiate
               public HeroManagerClass() {
               heroes = new ArrayList<>();
             }   

  // Bubble Sort 
        public void bubbleSortbyPowerLevel() {
        int n = heroes.size();
            for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                    if (heroes.get(j).getPowerLevel() > heroes.get(j + 1).getPowerLevel()) {
                        HeroClass temp = heroes.get(j);
                        heroes.set(j, heroes.get(j + 1));
                        heroes.set(j + 1, temp);
                    }
                }
         }
        }

     // Insertion Sort 

    public void insertionSortbyPowerlevel() {
        int n = heroes.size();
        for (int i = 1; i < n; i++) {
            HeroClass key = heroes.get(i);
            int j = i - 1;
            while (j >= 0 && heroes.get(j).getPowerLevel() > key.getPowerLevel()) {
                heroes.set(j + 1, heroes.get(j));
                j--;
            }
            heroes.set(j + 1, key);
        }
    }



        // Add Hero
    public void addHero(HeroClass hero) {
        heroes.add(hero);
    }
       // Remove Hero by name

    public boolean removeHero(String name) {
        return heroes.removeIf(hero -> hero.getName().equalsIgnoreCase(name));
    }
   // Display Heroes in 2D Array Format
    public void displayHeroesAs2DArray() {
     String[][] heroArray = new String[heroes.size()][3];
        for (int i = 0; i < heroes.size(); i++) {
            HeroClass hero = heroes.get(i);
            heroArray[i][0] = hero.getName();
            heroArray[i][1] = String.valueOf(hero.getPowerLevel());
            heroArray[i][2] = hero.getAffiliation().name();
        }
        System.out.println(Arrays.deepToString(heroArray));
    }



   // Display method to display all heroes
    public void displayHeroes() {
     for (HeroClass hero : heroes) {
      System.out.println(hero);
        }
}
}
