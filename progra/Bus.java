package progra;

public class Bus {
    int capacidad;
    int estudiantesSistemas;
    int estudiantesIndustrial;
    int dineroSistemas;
    int dineroIndustrial;

    public Bus(int capacidad) {
        this.capacidad = capacidad;
        estudiantesSistemas = 0;
        estudiantesIndustrial = 0;
        dineroSistemas = 0;
        dineroIndustrial = 0;
    }

    public boolean estaLleno() {
        return (estudiantesSistemas + estudiantesIndustrial) >= capacidad;
    }

    public void registrarEstudianteSistemas() {
        if (!estaLleno()) {
            estudiantesSistemas++;
            dineroSistemas += 80000;
        }
    }

    public void registrarEstudianteIndustrial() {
        if (!estaLleno()) {
            estudiantesIndustrial++;
            dineroIndustrial += 100000;
        }
    }

    public void imprimirInfo(int numeroBus) {
        System.out.println("Bus " + numeroBus + ":");
        System.out.println("  Sistemas: " + estudiantesSistemas + ", Dinero: " + dineroSistemas);
        System.out.println("  Industrial: " + estudiantesIndustrial + ", Dinero: " + dineroIndustrial);
    }
}