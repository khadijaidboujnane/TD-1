package td1;

import java.util.Scanner;

public class maxsuite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int position = 0;
        int nombre;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Entrez un nombre : ");
            nombre = scanner.nextInt();

            if (nombre > max) {
                max = nombre;
                position = i;
            }
        }
    }
}

