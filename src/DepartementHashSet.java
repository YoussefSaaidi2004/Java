import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DepartementHashSet implements IDepartement<Departement> {
    private final Set<Departement> departements = new HashSet<>();

    @Override
    public void ajouterDepartement(Departement d) {
        if (d != null) {
            departements.add(d);
        }
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        if (nom == null) return false;
        for (Departement d : departements) {
            if (d.getNom() != null && d.getNom().equalsIgnoreCase(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement d) {
        return d != null && departements.contains(d);
    }

    @Override
    public void supprimerDepartement(Departement d) {
        if (d != null) {
            departements.remove(d);
        }
    }

    @Override
    public void displayDepartement() {
        for (Departement d : departements) {
            System.out.println(d);
        }
    }

    @Override
    public TreeSet<Departement> trierDepartementById() {
        TreeSet<Departement> sorted = new TreeSet<>(Comparator.comparingInt(Departement::getId));
        sorted.addAll(departements);
        return sorted;
    }
}
