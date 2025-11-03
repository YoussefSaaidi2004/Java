package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatique {
    private int swimmingSpeed;

    public Dolphin(String family, String name, int age, boolean isMammal, String habitat, int swimmingSpeed)
            throws InvalidAgeException {
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    public int getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public void swim() {
        System.out.println(getName() + " nage à une vitesse de " + swimmingSpeed + " km/h.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Vitesse de nage : " + swimmingSpeed;
    }

    public void dolphin() {
        System.out.println("Aquatique dolphin");
    }
}
