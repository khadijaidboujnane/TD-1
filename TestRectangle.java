public class TestRectangle {
    public static void main(String[] args) {
        // Test des constructeurs
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(6.0, 4.0);
        Rectangle rectangle3 = new Rectangle(rectangle2);

        // Affichage des rectangles
        System.out.println("Rectangle 1: " + rectangle1);
        System.out.println("Rectangle 2: " + rectangle2);
        System.out.println("Rectangle 3 (copie de Rectangle 2): " + rectangle3);

        // Modification des attributs
        rectangle1.setLongueur(4.0);
        rectangle1.setLargeur(4.0);

        // Affichage des attributs après modification
        System.out.println("Rectangle 1 après modification: " + rectangle1);

        // Calcul du périmètre, de l'aire et vérification si c'est un carré
        System.out.println("Périmètre de Rectangle 2: " + rectangle2.perimetre());
        System.out.println("Aire de Rectangle 2: " + rectangle2.aire());
        System.out.println("Rectangle 2 est un carré : " + rectangle2.isCarre());
    }
}
