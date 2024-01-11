package td2;

// ex3 td2
public class Livre {




    private String titre;
    private String auteur;
    private double prix;
    private int annee;

    // Constructeurs
    public Livre() {
    }

    public Livre(String titre) {
        this.titre = titre;
    }

    public Livre(String titre, String auteur) {
        this.titre = titre;
        this.auteur = auteur;
    }

    public Livre(String titre, String auteur, double prix) {
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;
    }

    public Livre(String titre, String auteur, double prix, int annee) {
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;
        this.annee = annee;
    }

    public Livre(Livre autreLivre) {
        this.titre = autreLivre.titre;
        this.auteur = autreLivre.auteur;
        this.prix = autreLivre.prix;
        this.annee = autreLivre.annee;
    }

    // Accesseurs et mutateurs
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }
    @Override
    public String toString() {
        return "Livre{" +
                "titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", prix=" + prix +
                ", annee=" + annee +
                '}';
    }
    public class Main {
        public static void main(String[] args) {
            // Test des différents constructeurs
            Livre livre1 = new Livre();
            Livre livre2 = new Livre("Harry Potter");
            Livre livre3 = new Livre("Le Seigneur des Anneaux", "J.R.R. Tolkien");
            Livre livre4 = new Livre("1984", "George Orwell", 15.99);
            Livre livre5 = new Livre("Clean Code", "Robert C. Martin", 29.99, 2008);

            // Test du constructeur par copie
            Livre livre6 = new Livre(livre4);

            // Affichage des livres
            System.out.println(livre1);
            System.out.println(livre2);
            System.out.println(livre3);
            System.out.println(livre4);
            System.out.println(livre5);
            System.out.println(livre6);

            // Modification d'un livre et affichage
            livre2.setPrix(50.5);
            livre2.setAnnee(2020);
            System.out.println("\nLivre modifié : " + livre2);
        }
    } }









