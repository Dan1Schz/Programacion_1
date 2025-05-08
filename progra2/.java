import java.util.Scanner;

class Sala {
    private int capacidad;
    private int ocupacion;

    public Sala(int capacidad) {
        this.capacidad = capacidad;
        this.ocupacion = 0;
    }

    public boolean ingresarCliente() {
        if (ocupacion < capacidad) {
            ocupacion++;
            return true;
        }
        return false;
    }

    public boolean estaLlena() {
        return ocupacion >= capacidad;
    }

    public int getOcupacion() {
        return ocupacion;
    }

    public int getCapacidad() {
        return capacidad;
    }
}

public class CineRambo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sala sala1 = new Sala(3);
        Sala sala2 = new Sala(4);
        Sala sala3 = new Sala(5);

        while (!(sala1.estaLlena() && sala2.estaLlena() && sala3.estaLlena())) {
            System.out.println("Seleccione sala (1, 2 o 3):");
            int sala = sc.nextInt();
            if (sala == 1)
                if (!sala1.estaLlena()) {
                    sala1.ingresarCliente();
                    System.out.println("Sala 1: " + sala1.getOcupacion() + "/" + sala1.getCapacidad());
                } else System.out.println("Sala 1 está llena.");
            else if (sala == 2)
                if (!sala2.estaLlena()) {
                    sala2.ingresarCliente();
                    System.out.println("Sala 2: " + sala2.getOcupacion() + "/" + sala2.getCapacidad());
                } else System.out.println("Sala 2 está llena.");
            else if (sala == 3)
                if (!sala3.estaLlena()) {
                    sala3.ingresarCliente();
                    System.out.println("Sala 3: " + sala3.getOcupacion() + "/" + sala3.getCapacidad());
                } else System.out.println("Sala 3 está llena.");
            else
                System.out.println("Sala inválida.");
        }

        System.out.println("Todas las salas están llenas.");
        sc.close();
    }
}
