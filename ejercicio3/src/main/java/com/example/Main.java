package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            // Mostrar menú de opciones
            System.out.println("Seleccione una figura geométrica:");
            System.out.println("1. Triángulo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Rectángulo");
            System.out.println("4. Círculo");
            System.out.println("0. Salir");

            // Leer la opción del usuario
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    calcularTriangulo(scanner);
                    break;
                case 2:
                    calcularCuadrado(scanner);
                    break;
                case 3:
                    calcularRectangulo(scanner);
                    break;
                case 4:
                    calcularCirculo(scanner);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 0);
    }

    private static void calcularTriangulo(Scanner scanner) {
       System.out.println("Intruduze la base del triangulo");
       double baseTrangulo = scanner.nextDouble();
       System.out.println("Ingresa la altura del triangulo");
       double alturaTriangulo = scanner.nextDouble();
       double area = (baseTrangulo + alturaTriangulo) / 2;
       System.out.println("el area del triangulo es: " +area);
     }

    private static void calcularCuadrado(Scanner scanner) {
       System.out.println("1ngresa el lado del cuadreado");
       double ladocuadrado = scanner.nextDouble();
       double area = ladocuadrado*ladocuadrado;
       System.out.println("el area del cuadrado es: " +area);
    }

    private static void calcularRectangulo(Scanner scanner) {
        System.out.println("Ingrese la base del rectángulo:");
        double base = scanner.nextDouble();
        System.out.println("Ingrese la altura del rectángulo:");
        double altura = scanner.nextDouble();
        double area = base * altura;
        double perimetro = 2 * (base + altura);
        System.out.println("El área del rectángulo es: " + area);
        System.out.println("El perímetro del rectángulo es: " + perimetro);
    }
    private static void calcularCirculo(Scanner scanner) {
        System.out.println("Ingrese el radio del círculo:");
        double radio = scanner.nextDouble();
        double area = Math.PI * Math.pow(radio, 2);
        double circunferencia = 2 * Math.PI * radio;
        System.out.println("El área del círculo es: " + area);
        System.out.println("La circunferencia del círculo es: " + circunferencia);
    }
}      