package clase7oct2024;

public class ejercicio4 {
    public static void main(String s[]) {
        int marks = 80;
        if (marks > 70) {
            System.out.println("distinction");
            if (marks > 35) {
                System.out.println("Pass");
            } else {
                System.out.println("Fail");
                System.out.println("Better luck next time");
            }
        }
    }
}
