package td1;

import java.util.Scanner;

public class factorielle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un entier naturel N : ");
        int N = scanner.nextInt();

        if (N < 0) {
            System.out.println("Veuillez entrer un entier naturel positif.");
        } else {
            long factoriel = 1;

            for (int i = 1; i <= N; i++) {
                factoriel *= i;
            }

            System.out.println("Le factoriel de " + N + " est : " + factoriel);
        }
    }
}
