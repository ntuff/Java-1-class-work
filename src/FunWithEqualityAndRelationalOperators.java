import java.util.Scanner;

public class FunWithEqualityAndRelationalOperators {
    public static void main(String[] args) {
        System.out.println("Fun with... Equality and Relational Operators!");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int x = input.nextInt();
        System.out.println("Enter second number: ");
        int y = input.nextInt();

        if(x == y){
            System.out.println("X == y is true");
        } else {
            System.out.println("X == y is false");
        }

        if(x != y){
            System.out.println("X != y is true");
        } else {
            System.out.println("X != y is false");
        }

        if(x > y){
            System.out.println("X > y is true");
        } else {
            System.out.println("X > y is false");
        }

        if(x < y){
            System.out.println("X < y is true");
        } else {
            System.out.println("X < y is false");
        }
    }
}
