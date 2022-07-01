public class ShortTermDepositAccount extends DepositAccount {
    public ShortTermDepositAccount(String accountNumber, String ownerNationalCode, int balance, String dateOfOpeningAccount) {
        super(accountNumber, ownerNationalCode, balance, dateOfOpeningAccount);
        this.setInterestPercent(10);
        this.setTime(10);
    }
}
