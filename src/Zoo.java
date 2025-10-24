package tn.esprit.gestionzoo.entities;


public class Zoo {
    //  Attributs privés
    private String name;
    private String city;
    private Animal[] animals;
    private int nbrAnimals;
    private static final int NB_MAX_ANIMALS = 25;
    private Aquatique[] aquats;


    //  Constructeur
    public Zoo(String name, String city) {
        setName(name);
        this.city = city;
        this.animals = new Animal[NB_MAX_ANIMALS];
        this.nbrAnimals = 0;
        this.aquats = new Aquatique[NB_MAX_ANIMALS];
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

    public void addAquaticAnimal(Aquatic aquats) {
        if (aquats == null) {
            System.out.println(" Animal aquatique invalide !");
            return;
        }

        // Vérifier s’il reste une place dans le tableau des aquatiques
        for (int i = 0; i < aquats.length; i++) {
            if (aquatic[i] == null) {
                aquatic[i] = aquats;
                System.out.println(" Animal aquatique ajouté : " + aquats.getName());
                return;
            }
        }

        System.out.println(" Le tableau des animaux aquatiques est plein, impossible d’ajouter : " + aquatic.getName());
    }
    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0.0f;

        for (Aquatic aquatic : aquats) {
            if (aquatic instanceof Penguin) {
                Penguin p = (Penguin) aquatic;
                if (p.getSwimmingDepth() > maxDepth) {
                    maxDepth = p.getSwimmingDepth();
                }
            }
        }

        return maxDepth;
    }
    public void displayNumberOfAquaticsByType() {
        int countDolphins = 0;
        int countPenguins = 0;

        for (Aquatique aquatic : aquats) {
            if (aquatic != null) {
                if (aquatique instanceof Dolphin) {
                    countDolphins++;
                } else if (aquatique instanceof Penguin) {
                    countPenguins++;
                }
            }
        }

        System.out.println("Nombre de dauphins : " + countDolphins);
        System.out.println("Nombre de pingouins : " + countPenguins);
    }

}
