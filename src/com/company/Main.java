package com.company;


import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        char[] arrayFruta = new char[10];
        char arraylength = (char) arrayFruta.length;
        int contador = 0;

        arrayFruta[0] = "Morango";
        arrayFruta[1] = "Abacate";
        arrayFruta[2] = "Banana";
        arrayFruta[3] = "Laranja";
        arrayFruta[4] = "Maracujá";
        arrayFruta[5] = "Limão";
        arrayFruta[6] = "Mamão";
        arrayFruta[7] = "Manga";
        arrayFruta[8] = "Uva";
        arrayFruta[9] = "Abacaxi";

        System.out.println(arrayFruta[0]);

        /*while (contador < arraylength) {
            System.out.println(arrayFruta (contador+1));
            contador = contador + 1;
        }*/
    }
}
