import java.util.Scanner;

public class FunWithArithmeticOperators {

    public static void main(String[] args) {
        System.out.println("Fun with ... Arithmetic Operators!");

        // Get X and Y
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int x = input.nextInt();
        System.out.println("Enter second number: ");
        int y = input.nextInt();

        // Output
        System.out.printf("\nx + y: %d", x+y);
        System.out.printf("\nx - y: %d", x-y);
        System.out.printf("\nx * y: %d", x*y);
        System.out.printf("\nx / y: %d", x/y);
        System.out.printf("\nx %% y: %d", x%y);

    }
}
