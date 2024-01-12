package td1;

import java.util.Scanner;

public class ordrecroissant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la première variable : ");
        int a = scanner.nextInt();

        System.out.print("Entrez la deuxième variable : ");
        int b = scanner.nextInt();

        // Vérifier l'ordre et échanger si nécessaire
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        System.out.println("Les variables dans l'ordre croissant : " + a + ", " + b);
    }
}
