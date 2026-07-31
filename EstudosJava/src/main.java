
public class main {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i == 5) {

                continue; // pula a interação quando i é igual a 5
            }
            System.err.println(i);
        }

    }
}
