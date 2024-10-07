package clase7oct2024;

public class ejercicio3 {
    public static void main(String s[]) {
        boolean a, b, c;
        a = b = c = true;
        if (!a || (b && c)) {
            System.out.println("If executed");
        } else {
            System.out.println("Else executed");
        }
    }

}
