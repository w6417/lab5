package com.company;
import java.lang.*;

public class Main {

    /* public static void main(String[] args) {

 // do punktu 5
         try {
             Zad3 z = new Zad3();
             z.wypiszDługość(null);
         } catch (NullPointerException e) {
             e.printStackTrace(System.out);
             e.fillInStackTrace();
             throw e;
         }

      */
    //punkt 6
    /*
    public static void main(String[] args) throws Exception {
        try {
            Zad3 z = new Zad3();
            z.wypiszDługość(null);
        } catch (NullPointerException e) {
            e.printStackTrace(System.out);
            throw new Exception();
        }
    }
     */
    //punkt 7
    public static void main(String[] args) throws Exception {
        try {
            Zad3 z = new Zad3();
            z.wypiszDługość(null);
        } catch (NullPointerException e) {
            throw new Exception(e);
        }
    }

}

/*punkt 4, odpowiedź: tak*/