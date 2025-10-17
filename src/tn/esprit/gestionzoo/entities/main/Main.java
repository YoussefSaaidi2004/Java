package tn.esprit.gestionzoo.entities.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Terrestre;
import tn.esprit.gestionzoo.entities.Zoo;
import tn.esprit.gestionzoo.entities.Aquatique;
import tn.esprit.gestionzoo.entities.Dolphin;
import tn.esprit.gestionzoo.entities.Penguin;

public class Main {
    public static void main(String[] args) {
        //  Création du zoo
        Zoo zoo = new Zoo("Zoo de Tunis", "Tunis");

        //  Création des animaux
        Animal lion = new Animal("Félidé", "Lion", 5, true);
        Animal tigre = new Animal("Félidé", "Tigre", 3, true);
        Animal perroquet = new Animal("Oiseau", "Perroquet", 2, false);
        Terrestre chien = new Terrestre("Canidé", "Chien", 4, true, 4);
        Aquatique poisson = new Aquatique("Test" , "Test",1,true,"mer");
        Dolphin dauphin = new Dolphin("test1","test1",1,true,"mer",100);
        Penguin pen = new Penguin("test2","test2",2,true,2,150);



        //  Ajout d’animaux
        zoo.addAnimal(lion);
        zoo.addAnimal(tigre);
        zoo.addAnimal(perroquet);
        zoo.addAnimal(chien);
        zoo.addAnimal(poisson);
        zoo.addAnimal(dauphin);
        zoo.addAnimal(pen);
        dauphin.dolphin();
        poisson.swim();

        //  Affichage du zoo
        zoo.displayZoo();
    }
}
