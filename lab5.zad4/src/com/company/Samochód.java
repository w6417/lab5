package com.company;

public class Samochód {
    int predkosc=20;
    int przyspiesz(int a){
        if(a<0) {
            throw new IllegalArgumentException("Prędkość musi być wyższa niż 0");
        }
        System.out.println("Obecna prędkość samcchodu wynosi: " + (predkosc+a) + "km/h");

           return predkosc+a;
        }


}
