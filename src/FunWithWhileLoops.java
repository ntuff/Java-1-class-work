import java.util.Scanner;

public class FunWithWhileLoops {

    public static void main(String[] args) {
        System.out.println("Fun with loops!");
        Scanner input = new Scanner(System.in);

        int total = 0;
        int gradeCounter = 0;

        while(gradeCounter <= 3){
            System.out.println("Enter a number: ");
            int x = input.nextInt();

            total += x;
            gradeCounter++;
        }
        System.out.printf("Class average: %d", total/gradeCounter);
    }
}
