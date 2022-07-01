public class FreeLoanAccount extends BankAccount {
    private CreditCard creditCard;

    public FreeLoanAccount(String accountNumber, String ownerNationalCode, int balance, String dateOfOpeningAccount, String ownerName, String cardNumber, int cvv2, String expirationDate) {
        super(accountNumber, ownerNationalCode, balance, dateOfOpeningAccount);
        if (cardNumber.length() == 16) {
            creditCard = new CreditCard(ownerName, cardNumber, cvv2, expirationDate);
            System.out.println("creditCard created!");
        } else System.out.println("creditCard not created!");
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }
}
