import java.util.Scanner;

public class exercice2 {
    public static void main(String[] args) {

        // Initialisation du Scanner
        Scanner sc = new Scanner(System.in);

        // Traitement pour le premier client
        System.out.println("Entrer votre choix pour le premier client: ");
        int choix = sc.nextInt();
        int km = obtenirKilometres(sc);

        // Calcul du montant à payer pour le premier client
        double montant = calculMontant(km);
        afficherInformationsClient(choix, km, montant);

        // Traitement pour le deuxième client
        System.out.println("\nEntrer votre choix pour le deuxième client: ");
        int choix2 = sc.nextInt();
        int km2 = obtenirKilometres(sc);

        // Calcul du montant à payer pour le deuxième client
        double montant2 = calculMontant(km2);
        afficherInformationsClient(choix2, km2, montant2);

        // Fermeture du Scanner
        sc.close();
    }

    // Méthode pour obtenir le nombre de kilomètres
    public static int obtenirKilometres(Scanner sc) {
        int km;
        do {
            System.out.println("Entrez le nombre de kilomètres parcourus (doit être supérieur ou égal à 0): ");
            km = sc.nextInt();
            if (km < 0) {
                System.out.println("Le nombre de kilomètres doit être supérieur ou égal à 0.");
            }
        } while (km < 0);
        return km;
    }

    // Méthode pour calculer le montant à payer
    public static double calculMontant(int km) {
        if (km < 100) {
            return km * 0.20;
        } else if (km <= 500) {
            return km * 0.50;
        } else {
            return km * 0.80;
        }
    }

    // Méthode pour afficher les informations du client
    public static void afficherInformationsClient(int choix, int km, double montant) {
        System.out.println("Choix: " + choix);
        System.out.println("Kilomètres parcourus: " + km);
        System.out.println("Montant à payer: " + montant + " EUR");
    }
}
