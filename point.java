public class point {
    private double x;
    private double y;
    //constructeur
    public point(){
        this.x=0;
        this.y=0;
    }

    public point(double x ,double y){
        this.x=x;
        this.y=y;
    }
    //getter and setter


    public double getx() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    public double norme(){
        return Math.sqrt(x*x+y*y);
    }
    public static void main(String[] args){
        point pointB=new point();
        System.out.println("les coordonnee du point B est ( "+pointB.getx()+","+ pointB.getY()+")");
        pointB.setX(2);
        pointB.setY(3);
        System.out.println("les  nouvelles coordonnee du point B est ( "+pointB.getx()+","+ pointB.getY()+")");
        System.out.println(" la norme du point B est :   "+pointB.norme());

    }
}
