import java.util.Scanner;

public class FunWithIfStatements {

    public static void main(String[] args) {
        System.out.println(("Fun with... If Statements!"));

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int x = input.nextInt();

        if (x % 2 == 0) {
            System.out.println("this number is even!");
        } if (x % 2 != 0) {
            System.out.println("this number is odd!");

        }

    }

}
