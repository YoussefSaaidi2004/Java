public class Main {
    public static void main(String[] args) {
        Zoo zoo1 = new Zoo("Zoo de Tunis", "Tunis");
        Zoo zoo2 = new Zoo("Zoo de Sousse", "Sousse");

        Animal lion = new Animal("Simba", "Lion");
        Animal tigre = new Animal("Shere Khan", "Tigre");
        Animal ours = new Animal("Baloo", "Ours");
        Animal lion2 = new Animal("Simba", "Lion"); 

        zoo1.addAnimal(lion);
        zoo1.addAnimal(tigre);
        zoo1.addAnimal(ours);
        zoo1.addAnimal(lion2); 

        zoo1.afficher();

        int index = zoo1.searchAnimal(lion);
        System.out.println("Index de Simba : " + index);

        int index2 = zoo1.searchAnimal(lion2);
        System.out.println("Recherche d’un doublon : " + index2);

        zoo1.removeAnimal(tigre);
        zoo1.afficher();

        Zoo plusGrandZoo = Zoo.comparerZoo(zoo1, zoo2);
        System.out.println("Le zoo avec le plus d’animaux est : " + plusGrandZoo.getName());
    }
}