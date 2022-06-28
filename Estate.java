public class Estate {
    private int documentRegistrationCode;
    private int ownerNationalCode;
    private String address;
    private String purchaseDate;
    private int cost;

    public Estate(int documentRegistrationCode, int ownerNationalCode, String address, String purchaseDate, int cost) {
        this.documentRegistrationCode = documentRegistrationCode;
        this.ownerNationalCode = ownerNationalCode;
        this.address = address;
        this.purchaseDate = purchaseDate;
        this.cost = cost;
    }

    public Estate() {
    }

    public int getDocumentRegistrationCode() {
        return documentRegistrationCode;
    }

    public void setDocumentRegistrationCode(int documentRegistrationCode) {
        this.documentRegistrationCode = documentRegistrationCode;
    }

    public int getOwnerNationalCode() {
        return ownerNationalCode;
    }

    public void setOwnerNationalCode(int ownerNationalCode) {
        this.ownerNationalCode = ownerNationalCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
