package com.company;

public class Test {

    public static void main(String[] args) {
	Suma suma=new Suma();
        System.out.println(suma.dodaj(5,6));
        System.out.println(suma.dodaj(5.0,6.0));
        System.out.println(suma.dodaj(5,6,7));
        System.out.println(suma.dodaj(5.0,6.0,7.0));
    }
}
