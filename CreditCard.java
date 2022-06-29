import java.math.BigInteger;

public class CreditCard {
    private String ownerName;
    private String cardNumber;
    private int cvv2;
    private String expirationDate;

    public CreditCard(String ownerName, String cardNumber, int cvv2, String expirationDate) {
        if (cardNumber.length() != 16) throw new RuntimeException("CreditCardNumber is incorrect");
        this.ownerName = ownerName;
        this.cardNumber = cardNumber;
        this.cvv2 = cvv2;
        this.expirationDate = expirationDate;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCvv2() {
        return cvv2;
    }

    public void setCvv2(int cvv2) {
        this.cvv2 = cvv2;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }
}
