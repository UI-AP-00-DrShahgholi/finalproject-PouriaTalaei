public abstract class DepositAccount extends BankAccount {
    private int interestPercent;
    private int time;

    public DepositAccount(String accountNumber, String ownerNationalCode, int balance, String dateOfOpeningAccount) {
        super(accountNumber, ownerNationalCode, balance, dateOfOpeningAccount);
    }
}
