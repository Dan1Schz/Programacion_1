package progra;

import java.util.Scanner;

public class Paseo {
    Bus bus1;
    Bus bus2;
    Bus bus3;
    int totalSistemas;
    int totalIndustrial;
    int totalDineroSistemas;
    int totalDineroIndustrial;

    public Paseo() {
        bus1 = new Bus(10); // Bus 1 tiene capacidad para 10 estudiantes
        bus2 = new Bus(8);  // Bus 2 tiene capacidad para 8 estudiantes
        bus3 = new Bus(12); // Bus 3 tiene capacidad para 12 estudiantes

        totalSistemas = 0;
        totalIndustrial = 0;
        totalDineroSistemas = 0;
        totalDineroIndustrial = 0;
    }

    public void simularPaseo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¡Bienvenido al paseo! Ingrese 1 para un estudiante de Sistemas, 2 para un estudiante de Industrial.");

        // Simulando la llegada de estudiantes hasta que los 3 buses estén llenos
        while (!bus3.estaLleno()) {
            System.out.print("Ingrese tipo de estudiante (1-Sistemas, 2-Industrial): ");
            int tipo = scanner.nextInt();

            if (!bus1.estaLleno()) {
                if (tipo == 1) {
                    bus1.registrarEstudianteSistemas();
                    totalSistemas++;
                    totalDineroSistemas += 80000;
                } else if (tipo == 2) {
                    bus1.registrarEstudianteIndustrial();
                    totalIndustrial++;
                    totalDineroIndustrial += 100000;
                }
            } else if (!bus2.estaLleno()) {
                if (tipo == 1) {
                    bus2.registrarEstudianteSistemas();
                    totalSistemas++;
                    totalDineroSistemas += 80000;
                } else if (tipo == 2) {
                    bus2.registrarEstudianteIndustrial();
                    totalIndustrial++;
                    totalDineroIndustrial += 100000;
                }
            } else if (!bus3.estaLleno()) {
                if (tipo == 1) {
                    bus3.registrarEstudianteSistemas();
                    totalSistemas++;
                    totalDineroSistemas += 80000;
                } else if (tipo == 2) {
                    bus3.registrarEstudianteIndustrial();
                    totalIndustrial++;
                    totalDineroIndustrial += 100000;
                }
            }
        }

        scanner.close();
    }

    public void imprimirInformeFinal() {
        int totalEstudiantes = totalSistemas + totalIndustrial;
        int totalDinero = totalDineroSistemas + totalDineroIndustrial;

        System.out.println("--- INFORME FINAL ---");
        bus1.imprimirInfo(1);
        bus2.imprimirInfo(2);
        bus3.imprimirInfo(3);

        System.out.println("\nTotales Generales:");
        System.out.println("  Total Sistemas: " + totalSistemas);
        System.out.println("  Total Industrial: " + totalIndustrial);
        System.out.println("  Total Estudiantes: " + totalEstudiantes);
        System.out.println("  Total Dinero Sistemas: " + totalDineroSistemas);
        System.out.println("  Total Dinero Industrial: " + totalDineroIndustrial);
        System.out.println("  Total Dinero Recolectado: " + totalDinero);
    }
}