package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

public class Main {
    public static void main(String[] args) {
        // 🏞️ Création du zoo
        Zoo zoo = new Zoo("Zoo de Tunis", "Tunis");

        // 🦁 Création des animaux
        Animal lion = new Animal("Félidé", "Lion", 5, true);
        Animal tigre = new Animal("Félidé", "Tigre", 3, true);
        Animal perroquet = new Animal("Oiseau", "Perroquet", 2, false);

        // ➕ Ajout d’animaux
        zoo.addAnimal(lion);
        zoo.addAnimal(tigre);
        zoo.addAnimal(perroquet);

        // 📋 Affichage du zoo
        zoo.displayZoo();
    }
}
