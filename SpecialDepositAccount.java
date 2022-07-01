public class SpecialDepositAccount extends DepositAccount {
    public SpecialDepositAccount(String accountNumber, String ownerNationalCode, int balance, String dateOfOpeningAccount) {
        super(accountNumber, ownerNationalCode, balance, dateOfOpeningAccount);
        this.setInterestPercent(50);
        this.setTime(50);
    }
}
