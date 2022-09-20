import java.util.Scanner;

public class FunWithAccounts {
    public static void main(String[] args) {

        System.out.println("Fun with Accounts!");

        Account account = new Account("Noah Tuff", 0.00);
        System.out.printf("\nAccount name: %s balance: $%.2f",
                account.getName(), account.getBalance());

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an amount to deposit: ");
        double amount = input.nextDouble();
        account.deposit(amount);

        account.setName("Savings");
        System.out.printf("Account name: %s", account.getName());

        System.out.println("Enter an amount to withdraw: ");
        double withdrawal = input.nextDouble();
        account.withdrawal(amount);

    }
}
