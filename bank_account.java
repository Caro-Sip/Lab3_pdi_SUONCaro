public class bank_account {
    int account_number = 0;
    String owner = "";
    float balance = 0;

    bank_account(int account_number, String owner, float balance)
    {
        this.account_number = account_number;
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(float value)
    {
        if (value > 0)
        {
            balance += value;
        }
        else
        {
            System.out.println("ERROR: Invalid Deposit Amount!");
        }
    }

    public void withdraw(float value)
    {
        if ((balance - value) >= 0 && value > 0)
        {
            balance -= value;
        }
        else
        {
            System.out.println("ERROR: Invalid Withdrawal Amount!");
        }
    }

    public void displayAccountTable()
    {
        System.out.printf("%-15d %-20s %-10.2f%n", account_number, owner, balance);
    }
}
