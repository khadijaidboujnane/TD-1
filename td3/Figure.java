package td3;

abstract class Figure {

        protected String nom;

        public abstract double getPerimeter();

        public abstract double getAire();

        @Override
        public String toString() {
            return "Nom de la figure : " + nom;
        }
    }

    class Disque extends Figure {
        private Point centre;
        private double rayon;

        public Disque() {
            this.centre = new Point(0, 0);
            this.rayon = 1.0;
            this.nom = "Disque";
        }

        public Disque(Point centre, double rayon) {
            this.centre = centre;
            this.rayon = rayon;
            this.nom = "Disque";
        }

        public Disque(Point centre, double rayon, String nom) {
            this.centre = centre;
            this.rayon = rayon;
            this.nom = nom;
        }

        // Accesseurs et mutateurs pour les différents attributs
        public Point getCentre() {
            return centre;
        }

        public void setCentre(Point centre) {
            this.centre = centre;
        }

        public double getRayon() {
            return rayon;
        }

        public void setRayon(double rayon) {
            this.rayon = rayon;
        }

        // Implémentation des méthodes de la classe Figure
        @Override
        public double getPerimeter() {
            return 2 * Math.PI * rayon;
        }

        @Override
        public double getAire() {
            return Math.PI * rayon * rayon;
        }
    }

    class Rectangle extends Figure {
        private double longueur;
        private double largeur;

        public Rectangle() {
            this.longueur = 1.0;
            this.largeur = 1.0;
            this.nom = "Rectangle";
        }

        public Rectangle(double longueur, double largeur) {
            this.longueur = longueur;
            this.largeur = largeur;
            this.nom = "Rectangle";
        }

        public Rectangle(double longueur, double largeur, String nom) {
            this.longueur = longueur;
            this.largeur = largeur;
            this.nom = nom;
        }

        // Accesseurs et mutateurs pour les différents attributs
        public double getLongueur() {
            return longueur;
        }

        public void setLongueur(double longueur) {
            this.longueur = longueur;
        }

        public double getLargeur() {
            return largeur;
        }

        public void setLargeur(double largeur) {
            this.largeur = largeur;
        }

        // Implémentation des méthodes de la classe Figure
        @Override
        public double getPerimeter() {
            return 2 * (longueur + largeur);
        }

        @Override
        public double getAire() {
            return longueur * largeur;
        }
    }

    // Classe Point utilisée pour représenter le centre d'un disque
    class Point {
        private int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
        public class TestFigure {
            public static void main(String[] args) {
                Disque disque = new Disque(new Point(0, 0), 5.0, "Mon Disque");
                System.out.println(disque);
                System.out.println("Périmètre : " + disque.getPerimeter());
                System.out.println("Aire : " + disque.getAire());

                System.out.println();

                Rectangle rectangle = new Rectangle(3.0, 4.0, "Mon Rectangle");
                System.out.println(rectangle);
                System.out.println("Périmètre : " + rectangle.getPerimeter());
                System.out.println("Aire : " + rectangle.getAire());
            }
        }

    }





