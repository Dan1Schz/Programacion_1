import java.util.Scanner;

public class Cine {
    Sala sala1;
    Sala sala2;
    Sala sala3;

    public Cine() {
        sala1 = new Sala(3);
        sala2 = new Sala(4);
        sala3 = new Sala(5);
    }

    public void recibirClientes() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a CineColombia. Pelicula: RAMBO 20");

        while (!todasLlenas()) {
            System.out.println();
            System.out.println("Estado actual de ocupacion:");
            System.out.println("Sala 1: " + sala1.ocupacionActual() + "/" + sala1.capacidad);
            System.out.println("Sala 2: " + sala2.ocupacionActual() + "/" + sala2.capacidad);
            System.out.println("Sala 3: " + sala3.ocupacionActual() + "/" + sala3.capacidad);
            System.out.print("Elija una sala para entrar (1, 2 o 3): ");
            int eleccion = scanner.nextInt();

            switch (eleccion) {
                case 1:
                    if (!sala1.estaLlena()) {
                        sala1.agregarCliente();
                        System.out.println("Cliente ingresado a la Sala 1.");
                    } else {
                        System.out.println("Sala 1 esta llena. Elija otra sala.");
                    }
                    break;
                case 2:
                    if (!sala2.estaLlena()) {
                        sala2.agregarCliente();
                        System.out.println("Cliente ingresado a la Sala 2.");
                    } else {
                        System.out.println("Sala 2 esta llena. Elija otra sala.");
                    }
                    break;
                case 3:
                    if (!sala3.estaLlena()) {
                        sala3.agregarCliente();
                        System.out.println("Cliente ingresado a la Sala 3.");
                    } else {
                        System.out.println("Sala 3 esta llena. Elija otra sala.");
                    }
                    break;
                default:
                    System.out.println("Opcion no valida. Intente de nuevo.");
            }
        }

        scanner.close();
        System.out.println("\n¡Todas las salas estan llenas!");
    }

    public boolean todasLlenas() {
        return sala1.estaLlena() && sala2.estaLlena() && sala3.estaLlena();
    }

    public void mostrarResumen() {
        System.out.println("\n--- Resumen Final ---");
        System.out.println("Sala 1: " + sala1.ocupacionActual() + "/" + sala1.capacidad);
        System.out.println("Sala 2: " + sala2.ocupacionActual() + "/" + sala2.capacidad);
        System.out.println("Sala 3: " + sala3.ocupacionActual() + "/" + sala3.capacidad);
    }
}
