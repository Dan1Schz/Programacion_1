package eu;

import java.util.Scanner;

public class EstacionClimatica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tempMax, tempMin;
        int dias = 0; // Contador de días válidos
        double sumaMax = 0.0; // Suma de temperaturas máximas
        double sumaMin = 0.0; // Suma de temperaturas mínimas
        int errores = 0; // Contador de errores (temperaturas de 9°)

        while (true) {
            // Leer temperaturas
            System.out.print("Ingrese la temperatura máxima y mínima (0,0 para finalizar): ");
            tempMax = scanner.nextDouble();
            tempMin = scanner.nextDouble();

            // Condición de salida
            if (tempMax == 0 && tempMin == 0) {
                break;
            }

            // Verificar si alguna de las temperaturas es 9°
            if (tempMax == 9 || tempMin == 9) {
                System.out.println("Error: temperatura de 9° ingresada.");
                errores++;
                continue; // Saltar el resto del ciclo
            }

            // Sumar temperaturas y contar días válidos
            sumaMax += tempMax;
            sumaMin += tempMin;
            dias++;
        }

        // Calcular medias y porcentaje de errores
        double mediaMax = (dias > 0) ? sumaMax / dias : 0;
        double mediaMin = (dias > 0) ? sumaMin / dias : 0;
        double porcentajeErrores = (dias > 0) ? (double) errores / dias * 100 : 0;

        // Mostrar resultados
        System.out.println("\nResultados:");
        System.out.println("Número de días: " + dias);
        System.out.println("Media de temperaturas máximas: " + mediaMax);
        System.out.println("Media de temperaturas mínimas: " + mediaMin);
        System.out.println("Número de errores (temperaturas de 9°): " + errores);
        System.out.printf("Porcentaje de errores: %.2f%%\n", porcentajeErrores);

        scanner.close();
    }
}
