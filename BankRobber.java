public class BankRobber {
    private String robberName;
    private String accompliceName;
    private String job;
    private int wallet;

    public BankRobber() {
        this.robberName = "AmirAliAhmadinejad";
        this.accompliceName = "RostamAlavinejad";
        this.job = "robber";
        this.wallet = 0;
    }

    public String getRobberName() {
        return robberName;
    }

    public void setRobberName(String robberName) {
        this.robberName = robberName;
    }

    public String getAccompliceName() {
        return accompliceName;
    }

    public void setAccompliceName(String accompliceName) {
        this.accompliceName = accompliceName;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getWallet() {
        return wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }
}
