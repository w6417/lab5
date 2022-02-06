package com.company;

public class Osobowy extends Samochód {
    int predkosc_max=250;
    @Override
    int przyspiesz(int a) {

        if (a % 2 == 0) {
            try{predkosc = predkosc_max / a;
                System.out.println("Prędkość wynosi: "+ predkosc + "km/h");
                return predkosc;
            }
            catch(ArithmeticException e){
                System.out.println("Wprowadzona została wartość 0, nie można dzielić przez 0");
                return predkosc_max;
            }

        }
        else return super.przyspiesz(a);
    }
}
