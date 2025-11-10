public class Main {
    public static void main(String[] args) {

        // Création de l'objet de gestion
        SocieteArrayList societe = new SocieteArrayList();

        // Ajout des employés
        employe e1 = new employe(1, "Ali", "Ben Salah", "Informatique", 3);
        employe e2 = new employe(2, "Sami", "Trabelsi", "RH", 2);
        employe e3 = new employe(3, "Mouna", "Ben Ali", "Informatique", 1);
        employe e4 = new employe(4, "Hiba", "Mansour", "Comptabilité", 4);
        employe e5 = new employe(5, "Ahmed", "Khalifa", "RH", 5);

        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);
        societe.ajouterEmploye(e4);
        societe.ajouterEmploye(e5);

        // Affichage initial
        System.out.println("=== Liste initiale des employés ===");
        societe.displayEmploye();

        // Test de recherche par nom
        System.out.println("\nRecherche par nom 'Mouna' : " + societe.rechercherEmploye("Mouna"));
        System.out.println("Recherche par nom 'Karim' : " + societe.rechercherEmploye("Karim"));

        // Test de recherche par objet
        System.out.println("\nRecherche par objet e3 : " + societe.rechercherEmploye(e3));

        // Test de suppression
        System.out.println("\nSuppression de e2 (Sami)...");
        societe.supprimerEmploye(e2);
        System.out.println("Liste après suppression :");
        societe.displayEmploye();

        // Test tri par ID
        System.out.println("\n=== Tri par ID ===");
        societe.trierEmployeParId();
        societe.displayEmploye();

        // Test tri par Département puis Grade
        System.out.println("\n=== Tri par Département puis par Grade ===");
        societe.trierEmployeParNomDépartementEtGrade();
        societe.displayEmploye();
    }
}
