public class Main {
    public static void main(String[] args) {
        // Création d’un animal
        Animal lion = new Animal("Felidae", "Lion", 5, true);

        // Création d’un zoo
        Zoo myZoo = new Zoo("Safari Park", "Tunis", 20);

        // Affichage simple
        System.out.println("Animal : " + lion.name + " - Famille : " + lion.family + " - Âge : " + lion.age);
        System.out.println("Zoo : " + myZoo.name + " situé à " + myZoo.city + " avec " + myZoo.nbrCages + " cages.");
    }
}
