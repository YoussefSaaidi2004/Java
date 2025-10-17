package tn.esprit.gestionzoo.entities;


public class Terrestre extends Animal {
    private int nbrLegs;

    public Terrestre(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }
    public String toString() {
        return super.toString() + ", Nombre de pattes : " + nbrLegs;
    }
    public void setNbrLegs(int nbr) { nbrLegs = nbr; }
    public int getNbrLegs() { return nbrLegs; }
}
