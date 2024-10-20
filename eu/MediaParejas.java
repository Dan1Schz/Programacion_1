package eu;

import java.util.Scanner;

public class MediaParejas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1, n2;
        double m, max;

        // Leer los dos primeros números
        System.out.print("Ingrese el primer número: ");
        n1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        n2 = scanner.nextInt();

        // Calcular la media de la primera pareja
        max = (n1 + n2) / 2.0;

        // Mientras ninguno de los dos números sea 999
        while (n1 != 999 || n2 != 999) {
            // Leer una nueva pareja de números
            System.out.print("Ingrese el primer número: ");
            n1 = scanner.nextInt();
            System.out.print("Ingrese el segundo número: ");
            n2 = scanner.nextInt();

            // Si la entrada es 999 para ambos, salimos del ciclo
            if (n1 == 999 && n2 == 999) {
                break;
            }

            // Calcular la media de la pareja
            m = (n1 + n2) / 2.0;

            // Verificar si la media actual es mayor que la máxima
            if (m > max) {
                max = m;
            }
        }

        // Mostrar la media máxima
        System.out.println("Media máxima = " + max);

        scanner.close();
    }
}
