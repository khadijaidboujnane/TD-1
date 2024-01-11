public class Rectangle {
    private double longueur;
    private double largeur;

    // Constructeur par défaut
    public Rectangle() {
        this.longueur = 0.0;
        this.largeur = 0.0;
    }

    // Constructeur avec longueur et largeur
    public Rectangle(double longueur, double largeur) {
        setLongueur(longueur);
        setLargeur(largeur);
    }

    // Constructeur de copie
    public Rectangle(Rectangle rectangle) {
        this.longueur = rectangle.getLongueur();
        this.largeur = rectangle.getLargeur();
    }

    // Accesseurs et mutateurs avec vérification de positivité
    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        if (longueur > 0) {
            this.longueur = longueur;
        } else {
            System.out.println("La longueur doit être positive.");
        }
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        if (largeur > 0) {
            this.largeur = largeur;
        } else {
            System.out.println("La largeur doit être positive.");
        }
    }

    // Méthode pour calculer le périmètre
    public double perimetre() {
        return 2 * (longueur + largeur);
    }

    // Méthode pour calculer l'aire
    public double aire() {
        return longueur * largeur;
    }

    // Méthode pour vérifier si le rectangle est un carré
    public boolean isCarre() {
        return longueur == largeur;
    }

    // Méthode pour obtenir une représentation sous forme de chaîne de caractères
    @Override
    public String toString() {
        return "Rectangle [longueur=" + longueur + ", largeur=" + largeur + "]";
    }
}



