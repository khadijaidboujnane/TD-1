package td1;

import java.util.Scanner;

public class nbrjourmois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le numéro du mois : ");
        int mois = scanner.nextInt();

        if (mois >= 1 && mois <= 12) {
            int jours;

            if (mois == 2) {
                System.out.print("Entrez l'année (entre 1900 et 2100) : ");
                int annee = scanner.nextInt();

                if ((annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0)) {
                    jours = 29;
                } else {
                    jours = 28;
                }
            } else if (mois == 4 || mois == 6 || mois == 9 || mois == 11) {
                jours = 30;
            } else {
                jours = 31;
            }

            System.out.println("Le mois " + mois + " a " + jours + " jours.");
        } else {
            System.out.println("Numéro de mois non valide. Assurez-vous que le numéro est entre 1 et 12.");
        }
    }
}
