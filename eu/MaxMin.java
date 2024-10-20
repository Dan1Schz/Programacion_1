package eu;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double max, min, numero;
        
        // Leer el primer número
        System.out.print("Ingrese un número: ");
        numero = scanner.nextDouble();
        max = numero;
        min = numero;
        
        // Leer los siguientes 99 números
        for (int i = 2; i <= 100; i++) {
            System.out.print("Ingrese un número: ");
            numero = scanner.nextDouble();
            
            // Actualizar el valor máximo
            if (numero > max) {
                max = numero;
            }
            
            // Actualizar el valor mínimo
            if (numero < min) {
                min = numero;
            }
        }
        
        // Imprimir los resultados
        System.out.println("El valor máximo es: " + max);
        System.out.println("El valor mínimo es: " + min);
        
        scanner.close();
    }
}