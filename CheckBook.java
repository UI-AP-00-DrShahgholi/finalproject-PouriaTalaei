public class CheckBook {
    private String ownerNationalCode;
    private int checkNumber;
    private int page;

    public CheckBook(String ownerNationalCode, int checkNumber, int page) {
        this.ownerNationalCode = ownerNationalCode;
        this.checkNumber = checkNumber;
        this.page = page;
    }

    public String getOwnerNationalCode() {
        return ownerNationalCode;
    }

    public void setOwnerNationalCode(String ownerNationalCode) {
        this.ownerNationalCode = ownerNationalCode;
    }

    public int getCheckNumber() {
        return checkNumber;
    }

    public void setCheckNumber(int checkNumber) {
        this.checkNumber = checkNumber;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}
