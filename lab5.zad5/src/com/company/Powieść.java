package com.company;

public class Powieść extends Książka{
    String tytuł="Ogniem i mieczem";
    public void czytaniePowieści(){
        System.out.println(tytuł);
        super.czytanieKsiazki();
    }
}
