package com.company;
import java.lang.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws MyException{
        {
            System.out.println("Podaj o ile ma samochód przyspieszyć: ");
            Scanner liczba = new Scanner(System.in);

            int liczbba2 = liczba.nextInt();
            Samochód samochod1 = new Samochód();
           // samochod1.przyspiesz(liczbba2);
            Osobowy samochód2 = new Osobowy();
            Ciężarowy samochód3=new Ciężarowy();
            /*
            samochód2.przyspiesz(liczbba2);
            if (liczbba2 > samochód2.predkosc_max) {
                throw new MyException();
            }
            */
            /*
            samochód3.przyspiesz(liczbba2);
            if (liczbba2 > samochód3.predkosc_max) {
                throw new MyException();
            }
            */


        }}}



