//frist creating hero class 
public class HeroClass {
    private String name;
    private int powerLevel;
    private Affiliation affiliation;
    // Constructor to initiate 
               public HeroClass(String name, int powerLevel, Affiliation affiliation) {
                    this.name = name;
                    this.powerLevel = powerLevel;
                    this.affiliation = affiliation;
                 }    


    // Getter methods
    public String getName() {
        return name;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public Affiliation getAffiliation() {
        return affiliation;
    }

    // toString method
    public String toString() {
        return "Hero{name='" + name + "', powerLevel=" + powerLevel + ", affiliation=" + affiliation + "}";
    }
}
