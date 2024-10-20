package eu;

import java.util.Scanner;

public class MediaAlumnos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre;
        double basic, pascal, fortran, media;

        while (true) {  // Bucle infinito hasta que se ingrese ***
            // Leer el nombre del alumno
            System.out.print("Ingrese el nombre del alumno (o '***' para finalizar): ");
            nombre = scanner.nextLine();

            // Verificar si el nombre es '***' para salir del bucle
            if (nombre.equals("***")) {
                break;
            }

            // Leer calificaciones
            System.out.print("Ingrese la calificación de BASIC: ");
            basic = scanner.nextDouble();

            System.out.print("Ingrese la calificación de Pascal: ");
            pascal = scanner.nextDouble();

            System.out.print("Ingrese la calificación de FORTRAN: ");
            fortran = scanner.nextDouble();

            // Calcular y mostrar la media
            media = (basic + pascal + fortran) / 3;
            System.out.println("Alumno: " + nombre + ", Media: " + media);

            // Limpiar el buffer del scanner
            scanner.nextLine();
        }

        scanner.close();
        System.out.println("Fin del programa.");
    }
}
