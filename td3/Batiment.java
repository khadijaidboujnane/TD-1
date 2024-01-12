package td3;

public class Batiment {

        private String adresse;

        public Batiment() {
            this.adresse = "Adresse par défaut";
        }

        public Batiment(String adresse) {
            this.adresse = adresse;
        }

        public String getAdresse() {
            return adresse;
        }

        public void setAdresse(String adresse) {
            this.adresse = adresse;
        }

        @Override
        public String toString() {
            return "Adresse du bâtiment : " + adresse;
        }
    }

    class Maison extends Batiment {
        private int nbChambres;

        public Maison() {
            super();
            this.nbChambres = 0;
        }

        public Maison(String adresse, int nbChambres) {
            super(adresse);
            this.nbChambres = nbChambres;
        }

        public int getNbChambres() {
            return nbChambres;
        }

        public void setNbChambres(int nbChambres) {
            this.nbChambres = nbChambres;
        }

        @Override
        public String toString() {
            return super.toString() + "\nNombre de chambres : " + nbChambres;
        }
    }

    class Immeuble extends Batiment {
        private int nbAppart;

        public Immeuble() {
            super();
            this.nbAppart = 0;
        }

        public Immeuble(String adresse, int nbAppart) {
            super(adresse);
            this.nbAppart = nbAppart;
        }

        public int getNbAppart() {
            return nbAppart;
        }

        public void setNbAppart(int nbAppart) {
            this.nbAppart = nbAppart;
        }

        @Override
        public String toString() {
            return super.toString() + "\nNombre d'appartements : " + nbAppart;
        }
    }

    class TestBatiment {
        public static void main(String[] args) {
            Batiment batiment = new Batiment("5 Rue de la Liberté");
            System.out.println(batiment);

            System.out.println();

            Maison maison = new Maison("10 Avenue des Roses", 3);
            System.out.println(maison);

            System.out.println();

            Immeuble immeuble = new Immeuble("15 Rue de la Paix", 10);
            System.out.println(immeuble);
        }
    }


