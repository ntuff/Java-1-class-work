import java.util.ArrayList;
import java.util.Random;

public class FunWithArrayLists {

    public static void main(String[] args) {
        System.out.println("Fun with Array Lists");

        ArrayList<Integer> randomList = new ArrayList<>();

        Random random = new Random();
        int bound = random.nextInt(15) + 10;

        for(int i = 0; i < bound; i++){
            randomList.add((random.nextInt()));
        }

        randomList.sort(Integer::compareTo);

        for(int i: randomList){
            System.out.printf("%d, ", i);
        }

    }

}
