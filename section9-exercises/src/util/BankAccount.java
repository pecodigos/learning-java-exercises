package util;

public class BankAccount
{
    private int accountID;
    private String name;
    private double accountBalance;

    public BankAccount()
    {}

    public BankAccount(int accountID, String name, double accountBalance)
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
        accountBalance -= money + 5.00;
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

    public void setAccountBalance(double accountBalance)
    {
        this.accountBalance = accountBalance;
    }

    public int getAccountID()
    {
        return accountID;
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
