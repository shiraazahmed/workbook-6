import com.pluralsight.finance.BankAccount;
import ui.Valuable;

public class FinanceApp {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("123", "Pam", 12500);
        Valuable account2 = new BankAccount("456", "Gary", 1500);
// try to deposit money into both accounts
        account1.deposit(100);

         // This will not work because account2 is of type Valuable

        System.out.println("Account 1 balance: " + account1.getBalance());


    }
    }
