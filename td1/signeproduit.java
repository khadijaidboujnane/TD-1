package td1;

import java.util.Scanner;

public class signeproduit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la valeur de A : ");
        int a = scanner.nextInt();

        System.out.print("Entrez la valeur de B : ");
        int b = scanner.nextInt();

        if ((a > 0 && b > 0) || (a < 0 && b < 0)) {
            System.out.println("Le produit est positif.");
        } else if (a == 0 || b == 0) {
            System.out.println("Le produit est nul.");
        } else {
            System.out.println("Le produit est négatif.");
        }
    }

}
