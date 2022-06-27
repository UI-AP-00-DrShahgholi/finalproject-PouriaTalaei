public abstract class BankAccount {
    private String accountNumber;
    private String ownerNationalCode;
    private int balance;
    private String dateOfOpeningAccount;
    private int negativePoint;


    //ذخیره حساب
    public BankAccount(String accountNumber, String ownerNationalCode, int balance, String dateOfOpeningAccount) {
        this.accountNumber = accountNumber;
        this.ownerNationalCode = ownerNationalCode;
        this.balance = balance;
        this.dateOfOpeningAccount = dateOfOpeningAccount;
        negativePoint = 0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getOwnerNationalCode() {
        return ownerNationalCode;
    }

    public void setOwnerNationalCode(String ownerNationalCode) {
        this.ownerNationalCode = ownerNationalCode;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getDateOfOpeningAccount() {
        return dateOfOpeningAccount;
    }

    public void setDateOfOpeningAccount(String dateOfOpeningAccount) {
        this.dateOfOpeningAccount = dateOfOpeningAccount;
    }

    public int getNegativePoint() {
        return negativePoint;
    }

    public void setNegativePoint(int negativePoint) {
        this.negativePoint = negativePoint;
    }
}
