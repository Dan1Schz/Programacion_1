package eu;

import java.util.Scanner;

public class Error {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sw = 0; // Inicializamos el interruptor a 0
        double n;

        while (sw == 0) {
            // Leer el número
            System.out.print("Ingrese un número: ");
            n = scanner.nextDouble();

            // Verificar si el número es un entero comparando con su parte entera
            if (n != (int) n) {
                // Si el número no es entero
                System.out.println("Dato no válido");
                System.out.println("Ejecute nuevamente");
                sw = 1;  // Cambiamos el valor del interruptor para salir del bucle
            } else {
                // Si el número es entero
                System.out.println("Correcto, " + (int) n + " es entero");
            }
        }

        scanner.close();
    }
}

