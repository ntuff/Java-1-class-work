public class Account {
    private String name;
    private double balance;

    public Account(String name, double balance) {this.name = name;
    if(balance > 0)
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        if(amount > 0){
            this.balance = this.balance + amount;
        }
    }

    public void withdrawal(double amount){
        if(amount > this.balance){
            this.balance = this.balance - amount;
        }
    }
}
