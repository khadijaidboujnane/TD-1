package td3;

public class Point3 {
    protected int x, y;

    public Point3(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void affCoord() {
        System.out.println("Coordonnees : " + x + " " + y);
    }

    public void affiche() {
        System.out.println("Coordonnees : " + x + " " + y);
    }
}

class Centre extends Point {
    private char nom;

    public Centre(int x, int y, char nom) {
        super(x, y);
        this.nom = nom;
    }

    public void affNom() {
        System.out.println("Nom : " + nom);
    }

    @Override
    public void affiche() {
        super.affiche();
        System.out.println("Nom : " + nom);
    }
}

class Cercle extends Centre {
    private double rayon;

    public Cercle(int x, int y, char nom, double rayon) {
        super(x, y, nom);
        this.rayon = rayon;
    }

    public double calculerSurface() {
        return Math.PI * rayon * rayon;
    }
    public class Main {
        public static void main(String[] args) {
            Centre centre = new Centre(1, 2, 'A');
            centre.affiche();

            System.out.println();

            Cercle cercle = new Cercle(3, 4, 'B', 5.0);
            cercle.affiche();
            System.out.println("Surface du cercle : " + cercle.calculerSurface());
        }
}



}

