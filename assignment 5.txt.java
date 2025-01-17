Sandy Achraf
ID:20216500

problem 1:

public class BankAccount {
    private static int NumOfUsers = 0;
    private static int NumOfCalls = 0;
    private final String country = "Egypt";
    private String username;
    private String bankname;
    private double balance;

    public BankAccount() {
        NumOfUsers++;
        System.out.println("A new BankAccount object has been created.");
        this.balance = 0;
        this.username = "";
        this.bankname = "";
    }

    public BankAccount(String username, String bankname, double balance) {
        NumOfUsers++;
        System.out.println("A new BankAccount object has been created.");
        this.balance = balance;
        this.username = username;
        this.bankname = bankname;
    }

    public void Deposite(double amount) {
        NumOfCalls++;
        balance += amount;
    }

    public void Withdraw(double amount) {
        NumOfCalls++;
        balance -= amount;
    }

    public static int getNumOfUsers() {
        return NumOfUsers;
    }

    public static int getNumOfCalls() {
        return NumOfCalls;
    }

    public double getBalance() {
        return balance;
    }

    public String getUsername() {
        return username;
    }

    public String getBankname() {
        return bankname;
    }

    public String getCountry() {
        return country;
    }
}

problem 2:

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount("John", "ABC Bank", 1000);

        System.out.println("Initial balance of account1: " + account1.getBalance());
        System.out.println("Initial balance of account2: " + account2.getBalance());

        account2.Deposite(500);
        account2.Withdraw(200);

        System.out.println("Final balance of account2: " + account2.getBalance());

        System.out.println("Number of users in the system: " + BankAccount.getNumOfUsers());
        System.out.println("Number of calls to Deposite() function: " + BankAccount.getNumOfCalls());
        System.out.println("Number of calls to Withdraw() function: " + BankAccount.getNumOfCalls());
    }
}
