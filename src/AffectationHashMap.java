import java.util.TreeMap;
import java.util.HashMap;
import java.util.Map;


public class AffectationHashMap {
    private Map<employe, Departement> affectations = new HashMap<>();

    public AffectationHashMap() {}

    public boolean ajouterEmployeDepartement(employe e, Departement d) {
        if (e == null || d == null) return false;
        if (affectations.containsKey(e)) {
            System.out.println("Info: réaffectation de l'employé vers un nouveau département.");
        }
        affectations.put(e, d);
        e.setDept_name(d.getNom());
        d.setNbEmployes(d.getNbEmployes() + 1);
        return true;
    }
    public void afficherEmployesEtDepartements() {
        System.out.println("=== Employés & Départements (HashMap) ===");
        for (Map.Entry<employe, Departement> entry : affectations.entrySet()) {
            employe e = entry.getKey();
            Departement d = entry.getValue();
            System.out.println("Employé: " + e.getId() + " - " + e.getName() + " " + e.getSurname() + " | Département: " + d.getNom());
        }
    }
    public boolean supprimerEmployeDepartement(employe e) {
        if (e == null) return false;
        Departement d = affectations.remove(e);
        if (d == null) {
            System.out.println("Erreur : employé non trouvé dans les affectations.");
            return false;
        }
        d.setNbEmployes(Math.max(0, d.getNbEmployes() - 1));
        return true;
    }

    public boolean supprimerEmployeEmployeDepartement(employe e, Departement d) {
        if (e == null || d == null) return false;
        Departement current = affectations.get(e);
        if (!d.equals(current)) {
            System.out.println("Erreur : l'employé n'est pas affecté à ce département.");
            return false;
        }
        affectations.remove(e);
        d.setNbEmployes(Math.max(0, d.getNbEmployes() - 1));
        return true;
    }
    public void afficherEmployes() { affectations.keySet().forEach(e -> System.out.println("Employé: " + e.getName())); }
    public void afficherDepartements() { affectations.values().stream().distinct().forEach(d -> System.out.println("Département: " + d.getNom())); }
    boolean rechercherEmploye(employe e) { return affectations.containsKey(e); }
    boolean rechercherDepartement(Departement d) { return affectations.containsValue(d); }
    TreeMap<employe, Departement> TrierMap() { return new TreeMap<>(affectations); }
}
