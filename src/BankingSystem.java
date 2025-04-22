class BankAccount {
    private String name;
    private int accountNumber;
    private double balance;

    public BankAccount(String name, int accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful! Current Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Error: Insufficient funds. Current Balance: " + balance);
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful! Current Balance: " + balance);
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getDetails() {
        return "Name: " + name + "\nAccount Number: " + accountNumber + "\nBalance: " + balance;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("John Doe", 12345, 1000);

        account.deposit(500);
        account.withdraw(2000);
    }
}

