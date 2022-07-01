public class FreeLoanAccount extends BankAccount{
    private CreditCard creditCard;

    public FreeLoanAccount(String accountNumber, String ownerNationalCode, int balance, String dateOfOpeningAccount,String ownerName, String cardNumber, int cvv2, String expirationDate) {
        super(accountNumber, ownerNationalCode, balance, dateOfOpeningAccount);
        creditCard = new CreditCard(ownerName, cardNumber, cvv2, expirationDate);
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }
}
