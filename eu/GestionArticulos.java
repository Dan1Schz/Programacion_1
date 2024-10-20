package eu;

import java.util.Scanner;

public class GestionArticulos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String codigo;
        double precioUnitario;
        int numeroArticulos;

        int totalArticulosA = 0;
        int totalArticulosB = 0;
        double importeTotalA = 0.0;
        double importeTotalB = 0.0;

        // Ciclo para ingresar artículos
        while (true) {
            System.out.print("Ingrese el código del artículo (A, B) o 'X' para finalizar: ");
            codigo = scanner.nextLine();

            if (codigo.equalsIgnoreCase("X")) {
                break; // Salir del ciclo si se ingresa 'X'
            }

            System.out.print("Ingrese el precio unitario del artículo: ");
            precioUnitario = scanner.nextDouble();

            System.out.print("Ingrese el número de artículos: ");
            numeroArticulos = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            // Sumar al total según la categoría
            if (codigo.equalsIgnoreCase("A")) {
                totalArticulosA += numeroArticulos;
                importeTotalA += precioUnitario * numeroArticulos;
            } else if (codigo.equalsIgnoreCase("B")) {
                totalArticulosB += numeroArticulos;
                importeTotalB += precioUnitario * numeroArticulos;
            } else {
                System.out.println("Código inválido. Debe ser A o B.");
            }
        }

        // Mostrar resultados
        System.out.println("\nResumen de artículos:");
        System.out.println("Total artículos A: " + totalArticulosA);
        System.out.println("Importe total A: " + importeTotalA);
        System.out.println("Total artículos B: " + totalArticulosB);
        System.out.println("Importe total B: " + importeTotalB);

        scanner.close();
    }
}
