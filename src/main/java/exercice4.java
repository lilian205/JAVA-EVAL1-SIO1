import java.util.Scanner;

public class exercice4 {
    public static void main(String[] args) {

        // Initialisation du Scanner
        Scanner sc = new Scanner(System.in);

        //variable
        System.out.println("Entrer un nombre : ");
        int nb = sc.nextInt();

        while (nb <= 0) {
            System.out.println("Le nombre doit être superieur à 0");
            System.out.println("Entrer un nombre: ");
            nb = sc.nextInt();
        }

        //Code
        long factorielle = 1;
        for (int a = nb; a > 0; a--) {
            factorielle *= a;
        }
        System.out.println("La factorielle  de " + nb + " est : " + factorielle);
    }
}