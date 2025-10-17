package tn.esprit.gestionzoo.entities;

public class Aquatique extends Animal {
    private String habitat;
    public Aquatique(String family, String name, int age, boolean isMammal, String habitat ) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    public String getHabitat() {
        return habitat;
    }
    public String toString() {
        return super.toString() + ", Habitat : " + habitat;
    }
    public void swim() {
        System.out.println("Aquatique swimming");
    }
}
