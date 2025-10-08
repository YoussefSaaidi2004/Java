package tn.esprit.gestionzoo.entities;

public class Animal {
    // 🔒 Attributs privés
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    // 🧱 Constructeur
    public Animal(String family, String name, int age, boolean isMammal) {
        setFamily(family);
        setName(name);
        setAge(age);
        this.isMammal = isMammal;
    }

    // ⚙️ Getters et Setters avec validation
    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("⚠️ Le nom de l’animal ne peut pas être vide.");
        } else {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("⚠️ L’âge d’un animal ne peut pas être négatif.");
        } else {
            this.age = age;
        }
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean isMammal) {
        this.isMammal = isMammal;
    }

    // 🧾 Méthode d’affichage
    public void displayAnimal() {
        System.out.println("Famille : " + family + ", Nom : " + name + ", Âge : " + age + ", Mammifère : " + isMammal);
    }
}
