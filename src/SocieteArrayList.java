import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class SocieteArrayList implements IGestion<employe> {

    private ArrayList<employe> listeEmployes = new ArrayList<>();
    // Affectations Employe -> Departement (clé = id employé pour éviter mutation clé)
    private Map<Integer, Departement> affectations = new HashMap<>();

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

    // Trier les employés par Nom de departement puis par Grade (Comparator)
    @Override
    public void trierEmployeParNomDepartementEtGrade() {
        Collections.sort(listeEmployes, Comparator
                .comparing(employe::getDept_name)
                .thenComparingInt(employe::getGrade));
    }

    // ================== Nouvelle fonctionnalité ==================
    // Affecter un employé à un département (mise à jour du compteur du département)
    public void affecterEmployeDepartement(employe e, Departement d) {
        if (e == null || d == null) return;
        Integer id = e.getId();
        Departement ancien = affectations.get(id);
        if (ancien != null) {
            // décrémenter l'ancien département
            ancien.setNbEmployes(Math.max(0, ancien.getNbEmployes() - 1));
        }
        affectations.put(id, d);
        // mettre à jour le nom du département de l'employé
        e.setDept_name(d.getNom());
        // incrémenter le nouveau département
        d.setNbEmployes(d.getNbEmployes() + 1);
    }

    // Afficher les employés et leur département associé
    public void afficherEmployesEtDepartements() {
        System.out.println("=== Employés et départements associés ===");
        for (employe e : listeEmployes) {
            Departement d = affectations.get(e.getId());
            String dep = (d != null) ? d.getNom() : "Aucun";
            System.out.println(e.getId() + " - " + e.getName() + " -> Département: " + dep);
        }
        System.out.println("=== Statistiques départements ===");
        System.out.println("ID | Nom | Nb Employés");
        // Pour éviter doublons lors de multiples affectations, utiliser un set des départements déjà vus
        affectations.values().stream().distinct().forEach(dep ->
                System.out.println(dep.getId() + " | " + dep.getNom() + " | " + dep.getNbEmployes())
        );
    }
}

