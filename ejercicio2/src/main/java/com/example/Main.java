package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        adivinarNumero(1, 100, 5);
    }

    public static void adivinarNumero(int min_numero, int max_numero, int max_intentos) {
       Scanner scanner = new Scanner(System.in);
        int numeroSecreto = (int) (Math.random() * (max_numero - min_numero + 1)) + min_numero;
        int intentos = 0;
        int intentosRestantes = max_intentos;

        System.out.println("¡Bienvenido al juego de adivinar el número!");
        System.out.println("Estoy pensando en un número entre " + min_numero + " y " + max_numero + ". Tienes " + max_intentos + " intentos.");

        while (intentos < max_intentos) {
            System.out.println("Intenta adivinar el número:");
            int intento = scanner.nextInt();
            intentos++;
            intentosRestantes--;

            if (intento == numeroSecreto) {
                System.out.println("¡Felicidades! ¡Has adivinado el número!");
                return;
            } else if (intento < numeroSecreto) {
                System.out.println("El número secreto es mayor que " + intento + ". Te quedan " + intentosRestantes + " intentos.");
            } else {
                System.out.println("El número secreto es menor que " + intento + ". Te quedan " + intentosRestantes + " intentos.");
            }
        }
        System.out.println("¡Lo siento! Te has quedado sin intentos. El número secreto era " + numeroSecreto + ".");
    }
}