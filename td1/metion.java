package td1;

import java.util.Scanner;

public class metion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la moyenne de l'étudiant : ");
        double moyenne = scanner.nextDouble();

        if (moyenne >= 16) {
            System.out.println("Très Bien");
        } else if (moyenne >= 14) {
            System.out.println("Bien");
        } else if (moyenne >= 12) {
            System.out.println("Assez Bien");
        } else if (moyenne >= 10) {
            System.out.println("Passable");
        } else {
            System.out.println("Insuffisant");
        }
    }
}
