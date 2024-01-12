package td1;
import java.util.Scanner;
public class Max3nombres {
       public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Entrez le premier nombre : ");
            int a = scanner.nextInt();

            System.out.print("Entrez le deuxième nombre : ");
            int b = scanner.nextInt();

            System.out.print("Entrez le troisième nombre : ");
            int c = scanner.nextInt();

            int max = Math.max(Math.max(a, b), c);
            System.out.println("Le maximum des trois nombres est : " + max);
        }


}
