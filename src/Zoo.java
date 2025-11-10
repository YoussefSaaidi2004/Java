package tn.esprit.gestionzoo.entities;


public class Zoo {
    //  Attributs privés
    private String name;
    private String city;
    private Animal[] animals;
    private int nbrAnimals;
    private static final int NB_MAX_ANIMALS = 3;
    private Aquatique[] aquatic;


    //  Constructeur
    public Zoo(String name, String city) {
        setName(name);
        this.city = city;
        this.animals = new Animal[NB_MAX_ANIMALS];
        this.nbrAnimals = 0;
        this.aquatic = new Aquatique[NB_MAX_ANIMALS];
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
    public void addAnimal(Animal a) throws ZooFullException {
        if (a == null) {
            System.out.println("Animal invalide !");
            return;
        }

        // Vérifie si le zoo est plein
        if (nbrAnimals >= animals.length) {
            throw new ZooFullException("Le zoo est plein ! Impossible d’ajouter : " + a.getName());
        }

        animals[nbrAnimals] = a;
        nbrAnimals++;
        System.out.println("Animal ajouté : " + a.getName());
        System.out.println("Nombre d’animaux dans le zoo : " + nbrAnimals);
    }


    //  Méthode d’affichage
    public void displayZoo() {
        System.out.println("Zoo : " + name + " - Ville : " + city);
        System.out.println("Animaux présents (" + nbrAnimals + "/" + NB_MAX_ANIMALS + ") :");
        for (int i = 0; i < nbrAnimals; i++) {
            animals[i].displayAnimal();
        }
    }

    public void addAquaticAnimal(Aquatique aquats) {
        if (aquats == null) {
            System.out.println(" Animal aquatique invalide !");
            return;
        }

        // Vérifier s’il reste une place dans le tableau des aquatiques
        for (int i = 0; i < aquatic.length; i++) {
            if (aquatic[i] == null) {
                aquatic[i] = aquats;
                System.out.println(" Animal aquatique ajouté : " + aquats.getName());
                return;
            }
        }

        System.out.println(" Le tableau des animaux aquatiques est plein, impossible d’ajouter : " + aquats.getName());
    }
    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0.0f;

        for (Aquatique a : aquatic) { // ✅ corrected here
            if (a instanceof Penguin) {
                Penguin p = (Penguin) a;
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

        for (Aquatique a : aquatic) {
            if (a != null) {
                if (a instanceof Dolphin) {
                    countDolphins++;
                } else if (a instanceof Penguin) {
                    countPenguins++;
                }
            }
        }

        System.out.println("Nombre de dauphins : " + countDolphins);
        System.out.println("Nombre de pingouins : " + countPenguins);
    }
    public void makeAquaticsSwim() {
        for (Aquatique a : aquatic) {
            if (a != null) {
                a.swim();
            }
        }
    }

}
