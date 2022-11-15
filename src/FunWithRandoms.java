import java.util.Random;

public class FunWithRandoms {

    public static void main(String[] args) {

        Random random = new Random();

        for (int i = 0; i <100; i++){
            System.out.printf("%d ", random.nextInt(100));
        }

    }

}
