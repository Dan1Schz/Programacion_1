public class Sala {
    int capacidad;
    int ocupacion;

    public Sala(int cap) {
        capacidad = cap;
        ocupacion = 0;
    }

    public boolean estaLlena() {
        return ocupacion >= capacidad;
    }

    public void agregarCliente() {
        if (!estaLlena()) {
            ocupacion++;
        }
    }

    public int ocupacionActual() {
        return ocupacion;
    }
}
