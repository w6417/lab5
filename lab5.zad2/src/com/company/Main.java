package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        System.out.println("Podaj liczbę: ");
        Scanner liczba =new Scanner(System.in);
        double liczba2=0;
        while(true){
            try{
                liczba2=liczba.nextDouble();
                break;
            }
            catch(InputMismatchException e){
                System.out.println("Podaj poprawną liczbę!");
                liczba.next();
            }
        }
        if(liczba2<0){
            throw new IllegalArgumentException(String.format("Pierwiastek kwadratowy z liczby rzeczywistej %.4f nie istnieje!",liczba2));
        }
        System.out.println(String.format("Pierwiastek z %.4f to %.4f",liczba2, Math.sqrt(liczba2)));
    }
}
