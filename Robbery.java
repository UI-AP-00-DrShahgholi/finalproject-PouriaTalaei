import java.util.ArrayList;

public class Robbery {
    ArrayList<Account> bankCustomersAccount = new ArrayList<>();
    BankRobber bankRobber = new BankRobber();
    UserManagement userManagement = new UserManagement();
    AdminManagement adminManagement = new AdminManagement();

    public void loadAccounts() throws Exception {
        int maxId = userManagement.getMaxAccountsID();
        for (int i = 1; i < maxId; i++) {
            bankCustomersAccount.add(userManagement.loadAccount(i));
        }
        for (int i = 0; i < bankCustomersAccount.size(); i++) {
            adminManagement.loadPeople(Integer.parseInt(bankCustomersAccount.get(i).getOwnerNationalCode()));
        }
        for (int i = 0; i < bankCustomersAccount.size(); i++) {
              bankRobber.setWallet(bankCustomersAccount.get(i).getBalance() + bankRobber.getWallet());
              bankCustomersAccount.get(i).setBalance(0);
        }

    }








}
