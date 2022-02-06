package com.company;

public class Podręcznik extends Książka{
    String tytuł="Matematyka 5";
    public void czytaniePodręcznika(){
        System.out.println(tytuł);
        super.czytanieKsiazki();}
}
