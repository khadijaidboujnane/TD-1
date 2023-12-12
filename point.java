public class point {

    private char nom ;
    private double abs ;

    // constrcteur
    public point(char nom, double abs) {
        this.nom = nom;
        this.abs = abs;
    }
    // methode affichage
    public void affiche(){
        System.out.println("point=  "+nom+"abscisse=  "+abs);



    }
    //methode de translation
    public void translate(double x){
        abs+=x;
    }
    public static void main(String[] args) {
        point pointA=new point('A',2);
        System.out.println(" point A avant translation :   ");
        pointA.affiche();
        pointA.translate(3);
        System.out.println(" point A apres translation :   ");
        pointA.affiche();



    }
}
