import java.util.List;
import java.util.ArrayList;

public class bank {
    public static void main(String[] argv)
    {
        List<bank_account> accounts = new ArrayList<bank_account>();

        try(java.util.Scanner input = new java.util.Scanner(System.in))
        {
            System.out.print("Welcome to the Bank Account Manager!\n");
            System.out.print("How many accounts would you like to create? ");
            int num_accounts = input.nextInt();
            input.nextLine(); // Consume newline

            for (int counter = 0; counter < num_accounts; counter++)
            {
                System.out.print("Enter account number: ");
                int account_number = input.nextInt();
                input.nextLine(); // Consume newline

                System.out.print("Enter owner name: ");
                String owner = input.nextLine();

                System.out.print("Enter initial balance: ");
                float balance = input.nextFloat();

                input.nextLine();

                System.out.print("\n");

                bank_account account = new bank_account(account_number, owner, balance);
                accounts.add(account);
            }

            while(true)
            {
                System.out.print("Enter account number to access (or -1 to quit): ");
                int account_number = input.nextInt();
                if (account_number == -1)
                {
                    break;
                }

                bank_account selected_account = null;
                for (bank_account account : accounts) //shift through accounts list for owner
                {
                    if (account.account_number == account_number)
                    {
                        selected_account = account;
                        break;
                    }
                }

                if (selected_account == null)
                {
                    System.out.println("ERROR: Account not found!");
                    continue;
                }

                System.out.print("Enter 'd' to deposit, 'w' to withdraw: ");
                String action = input.next();

                System.out.print("Enter amount: ");
                float amount = input.nextFloat();

                if (action.equals("d"))
                {
                    selected_account.deposit(amount);
                }
                else if (action.equals("w"))
                {
                    selected_account.withdraw(amount);
                }
                else
                {
                    System.out.println("ERROR: Invalid action!");
                }

                System.out.printf("Account %d owned by %s has balance: %.2f\n",
                                  selected_account.account_number,
                                  selected_account.owner,
                                  selected_account.balance);
            }

            System.out.print("\n--- Final account states ---\n");
            System.out.printf("%-15s %-20s %-10s%n",
                            "Account Number",
                                    "Owner",
                                    "Balance");
            for (bank_account account : accounts)
            {
                account.displayAccountTable();
            }

            System.out.print("Thank you for using the Bank Account Manager. Goodbye!\n");
        }
        catch (Exception e)
        {
            System.out.println("ERROR: Invalid Input!");
        }
    }
}
