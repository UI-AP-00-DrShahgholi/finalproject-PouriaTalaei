public class OpeningAccount {

    public void openShortTermAccount(String typeAccount, String accountNumber, String ownerNationalCode, int balance, String dateOfOpeningAccount) {
        if (typeAccount.equals("sh"))
            throw new RuntimeException("invalid type");
        ShortTermDepositAccount shortTermDepositAccount = new ShortTermDepositAccount(accountNumber, ownerNationalCode, balance, dateOfOpeningAccount);
        //ذخیره
    }

    public void openLongTermDepositAccount(String typeAccount, String accountNumber, String ownerNationalCode, int balance, String dateOfOpeningAccount) {
        if (typeAccount.equals("lo"))
            throw new RuntimeException("invalid type");
        LongTermDepositAccount longTermDepositAccount = new LongTermDepositAccount(accountNumber, ownerNationalCode, balance, dateOfOpeningAccount);
        //ذخیره
    }

    public void openSpecialDepositAccount(String typeAccount, String accountNumber, String ownerNationalCode, int balance, String dateOfOpeningAccount) {
        if (typeAccount.equals("sp"))
            throw new RuntimeException("invalid type");
        SpecialDepositAccount specialDepositAccount = new SpecialDepositAccount(accountNumber, ownerNationalCode, balance, dateOfOpeningAccount);
        //ذخیره
    }
}