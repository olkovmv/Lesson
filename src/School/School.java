package School;

import java.util.Arrays;

public class School {
    private final String nazvanie = "Школа";
    private Director director;
    private Uchenik[] ucheniks = new Uchenik[3];
    private Uchitel[] uchitels = new Uchitel[3];

    public School() {
    }

    protected void dayInSChool() {
        director.obiaNachZan();
        for (Uchitel uchit : uchitels
        ) {
            if (uchit != null) {
                for (Uchenik uchen : ucheniks) {
                    if (uchen != null) {
                        if (uchen.getIzPredmet().equals(uchit.getPrepPredmet())) {
                            uchit.uchitKogo(uchen);
                            uchen.polZnania();
                            System.out.println("Ученик получает занния а учитель отдает");
                        }
                    }
                }
            }
            }
            director.obiaOkonZan();
        }


        public Director getDirector () {
            return director;
        }

        public void setDirector (Director director){
            this.director = director;
        }

        public Uchenik[] getUcheniks () {
            return ucheniks;
        }

        public void setUcheniks (Uchenik[]ucheniks){
            this.ucheniks = ucheniks;
        }

        public Uchitel[] getUchitels () {
            return uchitels;
        }

        public void setUchitels (Uchitel[]uchitels){
            this.uchitels = uchitels;
        }

        public void adUchenik (Uchenik newUchenik){
            for (int i = 0; i < ucheniks.length; i++) {
                if (ucheniks[i] == null) {
                    ucheniks[i] = newUchenik;
                    break; // return;
                }
            }
        }

        // добавление нескольких Учеников
        public void adUcheniks (Uchenik ...newUcheniks){
            for (int i = 0; i < ucheniks.length; i++) {
                if (ucheniks[i] == null) {
                    ucheniks[i] = newUcheniks[i];
                    break; // return;
                }
            }


        }

        public void adUchitel (Uchitel newUchitel){
            for (int i = 0; i < uchitels.length; i++) {
                if (uchitels[i] == null) {
                    uchitels[i] = newUchitel;
                    break; // return;
                }
            }
        }


        @Override
        public String toString () {
            return "School{" +
                    "ucheniks=" + Arrays.toString(ucheniks) +
                    '}';
        }
    }
