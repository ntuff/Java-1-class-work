public class FunWithAccounts {
    public static void main(String[] args) {

        System.out.println("Fun with Accounts!");

        Account account = new Account();
        account.setName("Savings");

        System.out.printf("Account name: %s", account.getName());
    }
}
