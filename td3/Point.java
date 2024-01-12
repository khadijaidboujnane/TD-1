package td3;

public class Point {
    private int x, y;

    // Constructeur
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void deplace(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
class PointA extends Point {
    // Constructeur appelant le constructeur de la classe de base (Point)
    public PointA(int x, int y) {
        super(x, y);
    }

    // Nouvelle méthode affiche
    public void affiche() {
        System.out.println("Coordonnées du point : (" + getX() + ", " + getY() + ")");
    }
    public static void main(String[] args) {
        // Création d'un objet Point
        Point point = new Point(1, 2);

        // Création d'un objet PointA
        PointA pointA = new PointA(3, 4);

        // Utilisation des méthodes de la classe Point
        System.out.println("Coordonnées du point : (" + point.getX() + ", " + point.getY() + ")");

        // Utilisation de la méthode affiche de la classe PointA
        pointA.affiche();
    }
}

