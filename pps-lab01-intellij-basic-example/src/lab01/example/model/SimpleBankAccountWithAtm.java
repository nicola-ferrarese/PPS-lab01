package lab01.example.model;

public class SimpleBankAccountWithAtm  extends  SimpleBankAccount implements BackAccountAtm{
    public SimpleBankAccountWithAtm(AccountHolder holder, double balance) {
        super(holder, balance);
    }
    private final int fee = 1;
    public double getFee(){
        return this.fee;
    }
    @Override
    public void deposit(final int userID, final double amount) {
        super.deposit(userID, amount - fee );
    }
    @Override
    public void withdraw(final int userID, final double amount) {
        super.withdraw(userID, amount + fee );
    }

}
