public class LongTermDepositAccount extends DepositAccount {
    public LongTermDepositAccount(String accountNumber, String ownerNationalCode, int balance, String dateOfOpeningAccount) {
        super(accountNumber, ownerNationalCode, balance, dateOfOpeningAccount);
        this.setInterestPercent(30);
        this.setTime(30);
    }
}
