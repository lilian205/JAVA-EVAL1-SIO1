import java.util.Scanner;import java.util.Scanner;

public class exercice1 {
    public static void main(String[] args) {

        //Initialisation du Scanner
        Scanner sc = new Scanner(System.in);

        //variable
        System.out.println("Entrer votre choix: ");
        int choix = sc.nextInt();

        System.out.println("Entrez un nombre: ");
        int nb = sc.nextInt();

        int puissance;

        do {
            System.out.println("Entrez la puissance (doit être supérieure ou égale à 0): ");
            puissance = sc.nextInt();

            if (puissance < 0) {
                System.out.println("La puissance doit être supérieure ou égale à 0.");
            }

        } while (puissance < 0);

        // Calcul du résultat
        double resultat = Math.pow(nb, puissance);
        System.out.println("Le résultat de " + nb + " puissance " + puissance + " est: " + resultat);

    }
}