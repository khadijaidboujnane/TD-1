package td1;

import java.util.Scanner;

public class operation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le premier nombre entier (a) : ");
        int a = scanner.nextInt();

        System.out.print("Entrez le deuxième nombre entier (b) : ");
        int b = scanner.nextInt();

        System.out.println("Choisissez une option :");
        System.out.println("1. Vérifier si la somme a + b est paire");
        System.out.println("2. Vérifier si le produit ab est pair");
        System.out.println("3. Connaître le signe de la somme a + b");
        System.out.println("4. Connaître le signe du produit ab");

        int choix = scanner.nextInt();

        switch (choix) {
            case 1:
                if ((a + b) % 2 == 0) {
                    System.out.println("La somme a + b est paire.");
                } else {
                    System.out.println("La somme a + b n'est pas paire.");
                }
                break;
            case 2:
                if ((a * b) % 2 == 0) {
                    System.out.println("Le produit ab est pair.");
                } else {
                    System.out.println("Le produit ab n'est pas pair.");
                }
                break;
            case 3:
                int somme = a + b;
                if (somme > 0) {
                    System.out.println("La somme a + b est positive.");
                } else if (somme < 0) {
                    System.out.println("La somme a + b est négative.");
                } else {
                    System.out.println("La somme a + b est nulle.");
                }
                break;
            case 4:
                int produit = a * b;
                if (produit > 0) {
                    System.out.println("Le produit ab est positif.");
                } else if (produit < 0) {
                    System.out.println("Le produit ab est négatif.");
                } else {
                    System.out.println("Le produit ab est nul.");
                }
                break;
            default:
                System.out.println("Option non valide.");
        }
    }
}
