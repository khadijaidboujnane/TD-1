package td3;

public class Figure2 {
    // Classe abstraite Figure
    abstract class Figure {
        protected String nom;

        public Figure() {
            this.nom = "Figure";
        }

        public Figure(String nom) {
            this.nom = nom;
        }

        public abstract double getPerimeter();

        public abstract double getAire();

        @Override
        public String toString() {
            return "Nom de la figure : " + nom;
        }
    }

    // Classe Disque héritant de Figure
    class Disque extends Figure {
        private Point centre;
        private double rayon;

        public Disque() {
            super("Disque");
            this.centre = new Point(0, 0);
            this.rayon = 1.0;
        }

        public Disque(Point centre, double rayon) {
            super("Disque");
            this.centre = centre;
            this.rayon = rayon;
        }

        public Disque(Point centre, double rayon, String nom) {
            super(nom);
            this.centre = centre;
            this.rayon = rayon;
        }

        // Accesseurs et mutateurs pour les attributs de Disque

        @Override
        public double getPerimeter() {
            return 2 * Math.PI * rayon;
        }

        @Override
        public double getAire() {
            return Math.PI * rayon * rayon;
        }
    }

    // Classe Rectangle héritant de Figure
    class Rectangle extends Figure {
        private double longueur;
        private double largeur;

        public Rectangle() {
            super("Rectangle");
            this.longueur = 1.0;
            this.largeur = 1.0;
        }

        public Rectangle(double longueur, double largeur) {
            super("Rectangle");
            this.longueur = longueur;
            this.largeur = largeur;
        }

        public Rectangle(double longueur, double largeur, String nom) {
            super(nom);
            this.longueur = longueur;
            this.largeur = largeur;
        }

        // Accesseurs et mutateurs pour les attributs de Rectangle

        @Override
        public double getPerimeter() {
            return 2 * (longueur + largeur);
        }

        @Override
        public double getAire() {
            return longueur * largeur;
        }
    }

    // Classe de testFigure
    public class TestFigure {
        public void main(String[] args) {
            // Test des classes Figure, Disque et Rectangle
            Figure figure = new Disque(new Point(2, 3), 4.0, "Cercle");
            System.out.println(figure);
            System.out.println("Perimètre : " + figure.getPerimeter());
            System.out.println("Aire : " + figure.getAire());

            System.out.println();

            figure = new Rectangle(5.0, 8.0, "Rectangle");
            System.out.println(figure);
            System.out.println("Perimètre : " + figure.getPerimeter());
            System.out.println("Aire : " + figure.getAire());
        }
    }

    // Classe Point pour représenter les coordonnées
    class Point {
        private double x, y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }
    }

}
