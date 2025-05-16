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
    
        System.out.println("\nIteración\t xl\t\t xu\t\t Xr\t\t f(xl)\t\t f(xu)\t\t f(xl)*f(xu)\t Error (%)");

        do {
            double fxl = funcion(xl);
            double fxu = funcion(xu);
            double producto = fxl * fxu;

            xrAnterior = xr;
            xr = (xl + xu) / 2; //Calcular el nuevo Xr

            //Operacion para decidir qué rango cambiar
            if (producto > 0) {
                xu = xr; //Cambiar el rango mayor
            } else if (producto < 0) {
                xl = xr; //Cambiar el rango menor
            } else {
                //Producto == 0 implica que es raiz exacta
                break;
            }

            //Calcular error a partir de la segunda iteración
            if (iteracion > 1) {
                error = Math.abs((xr - xrAnterior) / xr) * 100;
            }

            //Mostrar datos de la iteración
            System.out.printf("%d\t\t %.6f\t %.6f\t %.6f\t %.6f\t %.6f\t %.6f\t %.4f\n",
                    iteracion, xl, xu, xr, fxl, fxu, producto, error);

            iteracion++;

        } while (error > 1 && iteracion <= 100); //Detener si error < 1% o se exceden 100 iteraciones
    }
}

