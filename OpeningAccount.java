public class OpeningAccount {
    UserManagement userManagement = new UserManagement();

    public void openShortTermDepositAccount(String typeAccount, String accountNumber, String ownerNationalCode, int balance, String dateOfOpeningAccount) throws Exception {
        if (!typeAccount.equals("sh"))
            throw new RuntimeException("invalid type");
        ShortTermDepositAccount shortTermDepositAccount = new ShortTermDepositAccount(accountNumber, ownerNationalCode, balance, dateOfOpeningAccount);
        userManagement.insertAccounts(accountNumber, ownerNationalCode, balance, dateOfOpeningAccount);
    }

    public void openLongTermDepositAccount(String typeAccount, String accountNumber, String ownerNationalCode, int balance, String dateOfOpeningAccount) throws Exception {
        if (!typeAccount.equals("lo"))
            throw new RuntimeException("invalid type");
        LongTermDepositAccount longTermDepositAccount = new LongTermDepositAccount(accountNumber, ownerNationalCode, balance, dateOfOpeningAccount);
        userManagement.insertAccounts(accountNumber, ownerNationalCode, balance, dateOfOpeningAccount);
    }

    public void openSpecialDepositAccount(String typeAccount, String accountNumber, String ownerNationalCode, int balance, String dateOfOpeningAccount) throws Exception {
        if (!typeAccount.equals("sp"))
            throw new RuntimeException("invalid type");
        SpecialDepositAccount specialDepositAccount = new SpecialDepositAccount(accountNumber, ownerNationalCode, balance, dateOfOpeningAccount);
        userManagement.insertAccounts(accountNumber, ownerNationalCode, balance, dateOfOpeningAccount);
    }

    public void openFreeLoanAccount(String accountNumber, String ownerNationalCode, int balance, String dateOfOpeningAccount, String ownerName, String cardNumber, int cvv2, String expirationDate) throws Exception {
        FreeLoanAccount freeLoanAccount = new FreeLoanAccount(accountNumber, ownerNationalCode, balance, dateOfOpeningAccount, ownerName, cardNumber, cvv2, expirationDate);
        userManagement.insertAccounts(accountNumber, ownerNationalCode, balance, dateOfOpeningAccount);
    }

    public void openCurrentAccount(String accountNumber, String ownerNationalCode, int balance, String dateOfOpeningAccount, String ownerName, String cardNumber, int cvv2, String expirationDate, int checkNumber, int page) throws Exception {
        CurrentAccount currentAccount = new CurrentAccount(accountNumber, ownerNationalCode, balance, dateOfOpeningAccount, ownerName, cardNumber, cvv2, expirationDate, checkNumber, page);
        userManagement.insertAccounts(accountNumber, ownerNationalCode, balance, dateOfOpeningAccount);
    }
}