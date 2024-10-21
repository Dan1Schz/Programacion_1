import clase7oct2024.ejercicio3;

public class Ejecutar{
    public static void main(String[]args){
        //Creacion del objeto
    persona objP1 = new Persona ("pipe",1.80, 80, 22);
    
    objP1.caminar();
    String respuesta = objP1:IMC();
        System.out.println(respuesta);
        System.out.println(objP1.mayorEdad(20);
    }
}

public class persona {
    private String nombre;
    private double altura;
    private double peso;
    private int edad;

    // constructor
    public persona(String nombre, double altura, double peso, int edad) {
        this.nombre = nombre;
        this.altura = altura;
        this.peso = peso;
        this.edad = edad;
    }

    public void caminar() {
        System.out.println("caminando...");
    }

    public String IMC() {
        double indice = peso / (altura * altura);
        String msg = "IMC: " + indice;
        return msg;
    }

    public String mayorEdad(int edad) {
        String msg = "";
        if (edad >= 18) {
            msg = "Mayor de Edad";
        } else {
            msg = "Menor de Edad";
        }
        return msg;
    }
}