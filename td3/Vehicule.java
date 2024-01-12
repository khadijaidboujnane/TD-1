package td3;

public class Vehicule {
    // Question 1

    private int nbPassager;

    public Vehicule(int nbPassager) {
        this.nbPassager = nbPassager;
    }

    @Override
    public String toString() {
        return "Nombre de passagers : " + nbPassager;
    }
}

    // Question 2
    class Moto extends Vehicule {
        private int nbRoues = 2;


        public Moto(int nbPassager) {
            super(nbPassager);
        }
    }

    // Question 3
    class Avion extends Vehicule {
        private int nbMoteur;

        // Question 4
        public Avion(int nbP, int nbM) {
            super(nbP);
            this.nbMoteur = nbM;
        }
    }

    // Question 5
    class Triporteur extends Moto {
        // Ajout d'un constructeur pour Triporteur
        public Triporteur(int nbPassager) {
            super(nbPassager);
        }
        public class Main {
            public static void main(String[] args) {
                // Exemple d'utilisation
                Vehicule vehicule = new Vehicule(4);
                System.out.println(vehicule);

                Moto moto = new Moto(2);
                System.out.println(moto);

                Avion avion = new Avion(100, 4);
                System.out.println(avion);

                Triporteur triporteur = new Triporteur(1);
                System.out.println(triporteur);
            }
        }
    }





