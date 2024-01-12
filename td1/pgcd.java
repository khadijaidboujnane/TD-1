package td1;

import java.util.Scanner;

public class pgcd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le premier entier positif non nul (a) : ");
        int a = scanner.nextInt();

        System.out.print("Entrez le deuxième entier positif non nul (b) : ");
        int b = scanner.nextInt();

        if (a <= 0 || b <= 0) {
            System.out.println("Veuillez entrer des entiers positifs non nuls.");
        } else {
            int pgcd = calculerPGCD(a, b);
            System.out.println("Le PGCD de " + a + " et " + b + " est : " + pgcd);
        }
    }
    static int calculerPGCD(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }}



