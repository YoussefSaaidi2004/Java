package tn.esprit.gestionzoo.entities;

public abstract class Aquatique extends Animal {
    private String habitat;
    public Aquatique(String family, String name, int age, boolean isMammal, String habitat ) throws InvalidAgeException {
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
    public abstract void swim();
}
