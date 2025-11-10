import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SocieteArrayList implements IGestion<employe> {

    private ArrayList<employe> listeEmployes = new ArrayList<>();

    // Ajouter un employé
    @Override
    public void ajouterEmploye(employe e) {
        listeEmployes.add(e);
    }

    // Rechercher un employé par nom
    @Override
    public boolean rechercherEmploye(String nom) {
        for (employe e : listeEmployes) {
            if (e.getName().equalsIgnoreCase(nom)) {
                return true;
            }
        }
        return false;
    }

    // Rechercher un employé par objet
    @Override
    public boolean rechercherEmploye(employe e) {
        return listeEmployes.contains(e);
    }

    // Supprimer un employé
    @Override
    public void supprimerEmploye(employe e) {
        listeEmployes.remove(e);
    }

    // Afficher tous les employés
    @Override
    public void displayEmploye() {
        for (employe e : listeEmployes) {
            System.out.println("ID: " + e.getId() +
                    ", Nom: " + e.getName() +
                    ", Prénom: " + e.getSurname() +
                    ", Département: " + e.getDept_name() +
                    ", Grade: " + e.getGrade());
        }
    }

    // Trier les employés par ID (Comparable)
    @Override
    public void trierEmployeParId() {
        Collections.sort(listeEmployes, Comparator.comparingInt(employe::getId));
    }

    // Trier les employés par Nom de département puis par Grade (Comparator)
    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        Collections.sort(listeEmployes, Comparator
                .comparing(employe::getDept_name)
                .thenComparingInt(employe::getGrade));
    }
}

