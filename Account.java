class Account {
    private double balance;

    // No-argument constructor
    public Account() {
        this.balance = 0;
    }

    // Parameterized constructor
    public Account(double balance) {
        this.balance = balance;
    }

    // Method to deposit amount to the account
    public void deposit(double amount) {
        balance += amount;
    }

    // Method to withdraw amount from the account
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // Method to display the balance
    public void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}