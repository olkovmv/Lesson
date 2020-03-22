package School;

import re.bm.core.lesson6.Book;

public class School {
    final static String nazvanie = "Putinskaia";
    protected Director director;
    protected Uchenik[] ucheniks;
    protected Uchitel[] uchitels;




    protected void dayInSChool(){
        director.obiaNachZan();
        // Какое то словие про обучение
       director.obiaOkonZan();
    }



    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public Uchenik[] getUcheniks() {
        return ucheniks;
    }

    public void setUcheniks(Uchenik[] ucheniks) {
        this.ucheniks = ucheniks;
    }

    public Uchitel[] getUchitels() {
        return uchitels;
    }

    public void setUchitels(Uchitel[] uchitels) {
        this.uchitels = uchitels;
    }

    public void adUchenik(Uchenik newUchenik) {
        for (int i = 0; i < ucheniks.length; i++) {
            if (ucheniks[i] == null) {
                ucheniks[i] = newUchenik;
                break; // return;
            }
        }
    }

    // добавление нескольких Учеников
    public void adUchenik(Uchenik ...newUcheniks) {


    }

    public void adUchitel(Uchitel newUchitel) {
        for (int i = 0; i < uchitels.length; i++) {
            if (uchitels[i] == null) {
                uchitels[i] = newUchitel;
                break; // return;
            }
        }
    }

    // добавление нескольких Учеников
    public void adUchitel(Uchitel ...newUchitels) {


    }
}