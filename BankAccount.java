public class BankAccount {
    private static int nextAccountNumber = 1000;

    private int accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double initialBalance) {
        this.accountNumber = generateAccountNumber();
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }


    private static int generateAccountNumber() {
        return nextAccountNumber++;
    }

    // Instance method - Uses instance variables
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposited " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Instance method - Uses instance variables and a local variable
    public void withdraw(double amount) {
        // Local variable - Only accessible within this method
        double transactionFee = 2.5;

        if (amount + transactionFee <= this.balance) {
            this.balance -= (amount + transactionFee);
            System.out.println("Withdrew " + amount + ". Fee: " + transactionFee + ". New balance: " + balance);
        } else {
            System.out.println("Insufficient balance for this transaction.");
        }
    }

    // Static method - Displays a static variable
    public static void displayNextAccountNumber() {
        System.out.println("The next account number will be: " + nextAccountNumber);
    }

    // Instance method - Displays instance variables
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        // Creating two instances of BankAccount
        BankAccount account1 = new BankAccount("Musab Dahir", 500.00);
        BankAccount account2 = new BankAccount("Adow", 1000.00);

        // Displaying account details
        account1.displayAccountDetails();
        account2.displayAccountDetails();

        // Performing transactions
        account1.deposit(150.00);
        account1.withdraw(200.00);

        // Displaying next account number
        BankAccount.displayNextAccountNumber();
    }
}

