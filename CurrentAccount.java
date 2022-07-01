public class CurrentAccount extends BankAccount {
    private CreditCard creditCard;
    private CheckBook checkBook;

    public CurrentAccount(String accountNumber, String ownerNationalCode, int balance, String dateOfOpeningAccount, String ownerName, String cardNumber, int cvv2, String expirationDate, int checkNumber, int page) {
        super(accountNumber, ownerNationalCode, balance, dateOfOpeningAccount);
        creditCard = new CreditCard(ownerName, cardNumber, cvv2, expirationDate);
        checkBook = new CheckBook(ownerNationalCode, checkNumber, page);
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public CheckBook getCheckBook() {
        return checkBook;
    }

    public void setCheckBook(CheckBook checkBook) {
        this.checkBook = checkBook;
    }
}
