import java.util.Random;
import java.util.Arrays;

public class FunWithArrays {

    public static void main(String[] args) {

        System.out.println("Fun with Arrays!");
        final int BOUND = 10;

        int[] randomInts = new int[BOUND];
        Random random = new Random();

        for (int i = 0; i < randomInts.length; i++) {
            randomInts[i] = random.nextInt(1000);
        }

        System.out.println("Random ints:\n");
        Arrays.sort(randomInts);
        for (int i = 0; i < randomInts.length; i++) {
            System.out.printf("\nrandomInts[%d] = %d", i, randomInts[i]);

        }
    }

}
