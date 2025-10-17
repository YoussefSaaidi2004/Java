package tn.esprit.gestionzoo.entities;


public class Dolphin extends Aquatique {
    private int swimmingSpeed;;
    public Dolphin(String family, String name, int age, boolean isMammal, String habitat, int swimmingSpeed ) {
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }
    public int getSwimmingSpeed() {
        return swimmingSpeed;
    }
    public void setSwimmingSpeed(int swimmingSpeed) {this.swimmingSpeed = swimmingSpeed;}

    public String toString() {
        return super.toString() + ", Vitesse de nage : " + swimmingSpeed;
    }
    public void dolphin(){
        System.out.println("Aquatique dolphin");
    }

}
