package td3;

public class Point2 {
    private int x, y;

    // Constructeur correct
    public Point2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void deplace(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public void affCoord() {
        System.out.println("Coordonnees : " + x + " " + y);
    }
}
class PointNom extends Point {
    private char nom;

    // Constructeur de la classe PointNom
    public PointNom(int x, int y, char nom) {
        super(x, y);
        this.nom = nom;
    }

    // Méthode pour définir les coordonnées et le nom d'un objet PointNom
    public void setPointNom(int x, int y, char nom) {
        super.deplace(x - this.getX(), y - this.getY());
        this.nom = nom;
    }

    // Méthode pour définir seulement le nom d'un objet PointNom
    public void setNom(char nom) {
        this.nom = nom;
    }

    // Méthode pour afficher les coordonnées et le nom d'un objet PointNom
    public void affCoordNom() {
        System.out.println("Coordonnees : " + this.getX() + " " + this.getY() + ", Nom : " + nom);
    }
    public class TestPointNom {
        public static void main(String[] args) {
            PointNom pointNom = new PointNom(1, 2, 'A');

            // Affichage initial
            pointNom.affCoordNom();

            // Modification des coordonnées et du nom
            pointNom.setPointNom(3, 4, 'B');
            pointNom.affCoordNom();

            // Modification du nom seulement
            pointNom.setNom('C');
            pointNom.affCoordNom();
        }
    }

}



