package tn.esprit.gestionzoo.entities.main;

import tn.esprit.gestionzoo.entities.*;

public class Main {
    public static void main(String[] args) {
        // Création du zoo
        Zoo zoo = new Zoo("Zoo de Tunis", "Tunis");

        try {
            // Création des animaux
            Animal lion = new Animal("Félidé", "Lion", 5, true);
            Animal tigre = new Animal("Félidé", "Tigre", 3, true);
            Animal perroquet = new Animal("Oiseau", "Perroquet", 2, false);
            Terrestre chien = new Terrestre("Canidé", "Chien", 4, true, 4);
            Dolphin dauphin = new Dolphin("test1", "test1", 1, true, "mer", 100);
            Penguin pen = new Penguin("test2", "test2", 2, true, 2, 150);

            // Ajout d’animaux dans le zoo
            zoo.addAnimal(lion);
            zoo.addAnimal(tigre);
            zoo.addAnimal(perroquet);
            zoo.addAnimal(chien);
            zoo.addAnimal(dauphin);
            zoo.addAnimal(pen);

            // Exemple d’action sur un animal aquatique
            dauphin.dolphin();

        } catch (InvalidAgeException e) {
            System.err.println("Erreur : âge invalide pour un animal ! " + e.getMessage());
        } catch (ZooFullException e) {
            System.err.println("Erreur : le zoo est plein ! " + e.getMessage());
        }

        // Affichage final
        zoo.displayZoo();
    }
}
