package com.company;

public class Main {

    public static void main(String[] args) {
	Klient klient1=new Klient("Justyna","Lada","kobieta");
    Powieść powiesc = new Powieść();
    Książka ksiazka;
    ksiazka=(Książka) powiesc;
    powiesc.czytaniePowieści();
    }
}
