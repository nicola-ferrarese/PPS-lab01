package lab01.example.model;
import lab01.example.model.SimpleBankAccount;
public class SimpleBankAccountWithAtm  extends  SimpleBankAccount{
    public SimpleBankAccountWithAtm(AccountHolder holder, double balance) {
        super(holder, balance);
    }

    @Override
    public void deposit(final int userID, final double amount) {
        super.deposit(userID, amount-1 );
    }
}
