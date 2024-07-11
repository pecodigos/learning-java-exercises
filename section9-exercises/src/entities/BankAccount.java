package entities;

public class BankAccount
{
    private int accountID;
    private String name;
    private double accountBalance;

    public BankAccount()
    {}

    public BankAccount(int accountID, String name)
    {
        this.accountID = accountID;
        this.name = name;
    }

    public BankAccount(int accountID, String name, double accountBalance)
    {
        this.accountID = accountID;
        this.accountBalance = accountBalance;
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getAccountBalance()
    {
        return accountBalance;
    }

    public int getAccountID()
    {
        return accountID;
    }

    public void printMessage()
    {
        System.out.print("Is there an initial deposit (y/n)?");
    }

    public void deposit(double money)
    {
        accountBalance += money;
    }

    public void withdraw(double money)
    {
        accountBalance -= money + 5.00;
    }

    public String accountData()
    {
        return "Account "
                + getAccountID()
                + ", Holder: "
                + getName()
                + ", Balance: $"
                + String.format("%.2f", accountBalance);
    }
}
