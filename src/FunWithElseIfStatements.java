import java.util.Scanner;

public class FunWithElseIfStatements {

    public static void main(String[] args) {
        System.out.println(("Fun with... Else If Statements!"));
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int x = input.nextInt();

        if (x % 5 == 0) {
            System.out.println("this number is divisible by 5!");
        } else if (x % 5 == 1) {
            System.out.println("this number is not divisible by 5 and has a remainder of 1!");
        } else if (x % 5 == 2) {
            System.out.println("this number is not divisible by 5 and has a remainder of 2!");
        } else if (x % 5 == 3) {
            System.out.println("this number is not divisible by 5 and has a remainder of 3!");
        } else {
            System.out.println("this number is not divisible by 5 and has a remainder of 4!");
        }

    }

}
