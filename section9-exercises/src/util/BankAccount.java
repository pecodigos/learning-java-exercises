package util;

public class BankAccount
{
    private int accountID;
    private String name;
    private double accountBalance;

    public BankAccount()
    {}

    public BankAccount(double accountBalance, String name)
    {
        this.accountBalance = accountBalance;
        this.name = name;
    }

    public BankAccount(int accountID, double accountBalance, String name)
    {
        this.accountID = accountID;
        this.accountBalance = accountBalance;
        this.name = name;
    }

    public void deposit(double money)
    {
        accountBalance += money;
    }

    public void withdraw(double money)
    {
        accountBalance -= money;
    }

    public String accountData()
    {
        return "Account "
                + accountID
                + ", Holder: "
                + name
                + ", Balance: $"
                + String.format("%.2f", accountBalance);
    }
}
