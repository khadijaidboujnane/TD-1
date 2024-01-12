package td1;

import java.util.Scanner;

public class equationquadratique {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la valeur de a : ");
        double a = scanner.nextDouble();

        System.out.print("Entrez la valeur de b : ");
        double b = scanner.nextDouble();

        System.out.print("Entrez la valeur de c : ");
        double c = scanner.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double racine1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double racine2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Deux racines réelles distinctes : " + racine1 + " et " + racine2);
        } else if (discriminant == 0) {
            double racine = -b / (2 * a);
            System.out.println("Une racine réelle double : " + racine);
        } else {
            System.out.println("Aucune racine réelle, discriminant négatif.");
        }
    }
}
