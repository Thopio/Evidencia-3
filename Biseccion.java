package Evidencia_3;

import java.util.Scanner;

public class Biseccion {

    //Función a resolver: f(x) = x^2 - 2
    public static double funcion(double x) {
        return x * x - 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar valores iniciales de a y b
        System.out.print("Ingresa el valor del rango menor (xl): ");
        double xl = scanner.nextDouble();

        System.out.print("Ingresa el valor del rango mayor (xu): ");
        double xu = scanner.nextDouble();

        double xr = 0;
        double xrAnterior = 0;
        double error = 100; //error inicial
        int iteracion = 1;
    }
}
