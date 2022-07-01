public abstract class DepositAccount extends BankAccount {
    private int interestPercent;
    private int time;

    public DepositAccount(String accountNumber, String ownerNationalCode, int balance, String dateOfOpeningAccount) {
        super(accountNumber, ownerNationalCode, balance, dateOfOpeningAccount);
    }

    public int getInterestPercent() {
        return interestPercent;
    }

    public void setInterestPercent(int interestPercent) {
        this.interestPercent = interestPercent;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
