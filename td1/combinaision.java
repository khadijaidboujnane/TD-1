package td1;

import java.util.Scanner;

public class combinaision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un entier de trois chiffres non nuls : ");
        int n = scanner.nextInt();

        if (n >= 100 && n <= 999) {
            int digit1 = n / 100;
            int digit2 = (n / 10) % 10;
            int digit3 = n % 10;

            System.out.println("Les nombres formés par les chiffres de " + n + " sont :");
            System.out.println(digit1 * 100 + digit2 * 10 + digit3);
            System.out.println(digit1 * 100 + digit3 * 10 + digit2);
            System.out.println(digit2 * 100 + digit1 * 10 + digit3);
            System.out.println(digit2 * 100 + digit3 * 10 + digit1);
            System.out.println(digit3 * 100 + digit1 * 10 + digit2);
            System.out.println(digit3 * 100 + digit2 * 10 + digit1);
        } else {
            System.out.println("Entier non valide. Assurez-vous que l'entier est de trois chiffres non nuls.");
        }
    }
}



