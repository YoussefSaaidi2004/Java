package tn.esprit.gestionzoo.entities;


public class Zoo {
    //  Attributs privés
    private String name;
    private String city;
    private Animal[] animals;
    private int nbrAnimals;
    private static final int NB_MAX_ANIMALS = 25;

    //  Constructeur
    public Zoo(String name, String city) {
        setName(name);
        this.city = city;
        this.animals = new Animal[NB_MAX_ANIMALS];
        this.nbrAnimals = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println(" Le nom du zoo ne doit pas être vide.");
        } else {
            this.name = name;
        }
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }

    //  Méthode isZooFull()
    public boolean isZooFull() {
        return nbrAnimals >= NB_MAX_ANIMALS;
    }

    //  Méthode addAnimal() (Instruction 17)
    public boolean addAnimal(Animal a) {
        if (a == null) {
            System.out.println(" Animal invalide !");
            return false;
        }
        if (isZooFull()) {
            System.out.println(" Le zoo est plein, impossible d’ajouter : " + a.getName());
            return false;
        }
        animals[nbrAnimals] = a;
        nbrAnimals++;
        System.out.println(" Animal ajouté : " + a.getName());
        return true;
    }

    //  Méthode d’affichage
    public void displayZoo() {
        System.out.println("Zoo : " + name + " - Ville : " + city);
        System.out.println("Animaux présents (" + nbrAnimals + "/" + NB_MAX_ANIMALS + ") :");
        for (int i = 0; i < nbrAnimals; i++) {
            animals[i].displayAnimal();
        }
    }
}
