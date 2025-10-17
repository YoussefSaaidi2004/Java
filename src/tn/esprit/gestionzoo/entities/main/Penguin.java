package tn.esprit.gestionzoo.entities;

public class Penguin extends Terrestre {
    private int swimmingDepth;
    public Penguin(String family, String name, int age, boolean isMammal, int nbrLegs, int swimmingDepth) {
        super(family, name, age, isMammal, nbrLegs);
        this.swimmingDepth = swimmingDepth;
    }
    public int getSwimmingDepth() {
        return swimmingDepth;
    }
    public void setSwimmingDepth(int swimmingDepth) {this.swimmingDepth = swimmingDepth;}
    public String toString() {
        return super.toString() + ", Profondeur de nage : " + swimmingDepth;
    }
}
