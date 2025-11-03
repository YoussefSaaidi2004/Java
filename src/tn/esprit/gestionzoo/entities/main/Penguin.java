package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatique {
    private int wings;          // ex : nombre d’ailes (ou autres attributs)
    private float swimmingDepth;

    public Penguin(String family, String name, int age, boolean isMammal, int wings, float swimmingDepth)
            throws InvalidAgeException {
        super(family, name, age, isMammal, "océan");  // ou "continent" selon ton modèle
        this.wings = wings;
        this.swimmingDepth = swimmingDepth;
    }

    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    @Override
    public void swim() {
        System.out.println(getName() + " nage à une profondeur de " + swimmingDepth + " mètres.");
    }
}
