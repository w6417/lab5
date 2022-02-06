package com.company;

public class Klient extends Księgarnia{
    String imie;
    String nazwisko;
    String płeć;

    public Klient(String imie, String nazwisko, String płeć) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.płeć = płeć;

    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getPłeć() {
        return płeć;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setPłeć(String płeć) {
        this.płeć = płeć;
    }
}