package clase7oct2024;

public class ejercicio5 {
    public static void main(String[] args) {
        int india_score = 300, pakistan_score = 290;

        if (india_score > pakistan_score) {
            System.out.println("India Wins");
        } else {
            System.out.println("Pakistan Wins");
        }
    }

    class FindWinner2 {
        public static void main(String s[]) {
            int india_score = 300;
            int pakistan_score = 290;

            System.out.println(india_score > pakistan_score ? "India Wins" : "Pakistan Wins");
        }
    }
}
