public class BankLoan {
    private int initialValue;
    private int interestPercent;
    private int numberOfInstallments;
    private int installmentAmount;
    private String ownerNationalCode;

    public BankLoan(int initialValue, int interestPercent, int numberOfInstallments, String ownerNationalCode) {
        this.initialValue = initialValue;
        this.interestPercent = interestPercent;
        this.numberOfInstallments = numberOfInstallments;
        installmentAmount = initialValue * (interestPercent + 1) / numberOfInstallments;
        this.ownerNationalCode = ownerNationalCode;
    }

    public int getInitialValue() {
        return initialValue;
    }

    public void setInitialValue(int initialValue) {
        this.initialValue = initialValue;
    }

    public int getInterestPercent() {
        return interestPercent;
    }

    public void setInterestPercent(int interestPercent) {
        this.interestPercent = interestPercent;
    }

    public int getNumberOfInstallments() {
        return numberOfInstallments;
    }

    public void setNumberOfInstallments(int numberOfInstallments) {
        this.numberOfInstallments = numberOfInstallments;
    }

    public int getInstallmentAmount() {
        return installmentAmount;
    }

    public void setInstallmentAmount(int installmentAmount) {
        this.installmentAmount = installmentAmount;
    }

    public String getOwnerNationalCode() {
        return ownerNationalCode;
    }

    public void setOwnerNationalCode(String ownerNationalCode) {
        this.ownerNationalCode = ownerNationalCode;
    }

    public <T extends BankAccount> void licenseToGetLoan(T t) {
        if (t.getNegativePoint() < 5) {
            t.beAllowedToGetBankLoan = false;
        }
    }

    public boolean checkEnoughMoneyInWallet() throws Exception {
        return AdminManagement.loadDigitalWallet(Integer.parseInt(ownerNationalCode)) > installmentAmount;
    }

    public <T extends BankAccount> void getLoanProcess(T t) throws Exception {
        if (!checkEnoughMoneyInWallet()) {
            t.setNegativePoint(t.getNegativePoint() + 1);
            throw new RuntimeException("not enough money");
        }
        if (!t.beAllowedToGetBankLoan) return;
        // else وام دادن

    }

}
