package td2;

public class Temps {
    private int heures;
    private int minutes;
    private int secondes;

    public Temps() {
        this(0, 0, 0);
    }

    // Constructeur avec heures
    public Temps(int heures) {
        this(heures, 0, 0);
    }

    // Constructeur avec heures et minutes
    public Temps(int heures, int minutes) {
        this(heures, minutes, 0);
    }

    // Constructeur avec heures, minutes et secondes
    public Temps(int heures, int minutes, int secondes) {
        this.heures=heures;
        this.minutes=minutes;
        this.secondes=secondes;
    }

    // Constructeur par copie
    public Temps(Temps temps) {
        this(temps.heures, temps.minutes, temps.secondes);
    }

    public int getHeures() {
        return heures;
    }

    public void setHeures(int heures) {
        if (heures <= 0 && heures >= 23) {
            this.heures = heures;
        } else {
            System.out.println("heure incorrect ");
        }

    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        if (minutes >= 0 && minutes <= 59) {
            this.minutes = minutes;
        } else {
            System.out.println("Minutes invalides.");
        }
    }

    public int getSecondes() {
        return secondes;
    }

    public void setSecondes(int secondes) {
        if (secondes >= 0 && secondes <= 59) {
            this.secondes = secondes;
        } else {
            System.out.println("Secondes invalides.");
        }
    }

    // Méthodes d'ajout
    public void ajouterHeures(int heures) {
        int total = this.heures + heures;
        this.heures = (total >= 0 && total <= 23) ? total : total % 24;
    }
    public void ajouterMinutes(int minutes) {
        int total = this.minutes + minutes;
        if (total >= 0) {
            ajouterHeures(total / 60);
            this.minutes = total % 60;
        }
    }

    public void ajouterSecondes(int secondes) {
        int total = this.secondes + secondes;
        if (total >= 0) {
            ajouterMinutes(total / 60);
            this.secondes = total % 60;
        }
    }
    public String toString() {
        return String.format("%02d:%02d:%02d", heures, minutes, secondes);
    }

    public class Main {
        public static void main(String[] args) {
            Temps temps1 = new Temps();
            System.out.println("Temps par défaut: " + temps1);

            Temps temps2 = new Temps(5);
            System.out.println("Temps avec 5 heures: " + temps2);

            Temps temps3 = new Temps(2, 30);
            System.out.println("Temps avec 2 heures 30 minutes: " + temps3);

            Temps temps4 = new Temps(1, 15, 45);
            System.out.println("Temps avec 1 heure 15 minutes 45 secondes: " + temps4);

            Temps temps5 = new Temps(temps4);
            System.out.println("Copie de temps4: " + temps5);

            temps1.ajouterHeures(3);
            System.out.println("Ajouter 3 heures à temps1: " + temps1);

            temps2.ajouterMinutes(45);
            System.out.println("Ajouter 45 minutes à temps2: " + temps2);

            temps3.ajouterSecondes(120);
            System.out.println("Ajouter 2 secondes à temps3: " + temps3);
        }
    }











}
