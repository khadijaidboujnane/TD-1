package td2;

public class Banque {
    private int ncompte;
    private float sold;
    private String cin;

    // Constructeur
    public Banque(int ncompte, float sold, String cin) {
        this.ncompte = ncompte;
        this.sold = sold;
        this.cin = cin;
    }

    // Méthode pour déposer de l'argent
    public void deposer(float somme) {
        if (somme > 0) {
            sold += somme;
            System.out.println("Dépôt de " + somme + " effectué avec succès.");
        } else {
            System.out.println("La somme à déposer doit être positive.");
        }
    }

    // Méthode pour retirer de l'argent
    public void retirer(float somme) {
        if (somme > 0 && somme <= sold) {
            sold -= somme;
            System.out.println("Retrait de " + somme + " effectué avec succès.");
        } else {
            System.out.println("Montant invalide ou solde insuffisant.");
        }
    }

    // Méthode pour obtenir le solde
    public float avoirSold() {
        return sold;
    }

    // Méthode pour obtenir le numéro de compte
    public int avoirNcompte() {
        return ncompte;
    }

    // Méthode pour obtenir le numéro de CIN
    public String avoirCIN() {
        return cin;
    }

    // Méthode pour obtenir les informations complètes du compte
    public String avoirInfo() {
        return "Numéro de compte: " + ncompte + ", Solde: " + sold + ", CIN: " + cin;
    }
    public static void main(String[] args) {
        // Création d'un compte
        Banque compte = new Banque(1, 5000.75f, "AB 1200");

        // Affichage des informations du compte
        System.out.println("Informations du compte:");
        System.out.println(compte.avoirInfo());

        // Affichage du solde du compte
        System.out.println("Solde du compte: " + compte.avoirSold());

        // Dépôt de 500
        compte.deposer(500);

        // Affichage des informations du compte après dépôt
        System.out.println("Informations du compte après dépôt:");
        System.out.println(compte.avoirInfo());

        // Affichage du solde du compte après dépôt
        System.out.println("Solde du compte après dépôt: " + compte.avoirSold());

        // Retrait de 200
        compte.retirer(200);

        // Affichage des informations du compte après retrait
        System.out.println("Informations du compte après retrait:");
        System.out.println(compte.avoirInfo());

        // Affichage du solde du compte après retrait
        System.out.println("Solde du compte après retrait: " + compte.avoirSold());
    }
}
