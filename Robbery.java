import java.sql.Connection;
import java.util.ArrayList;

public class Robbery {
    ArrayList<Account> bankCustomersAccount = new ArrayList<>();
    BankRobber bankRobber = new BankRobber();
    UserManagement userManagement = new UserManagement();
    AdminManagement adminManagement = new AdminManagement();

    public void robberyProcess() throws Exception {
        addAccountsToArrayList();
        clearedAccountsByRobber();
        System.out.println("Robbed!");
        printInformationOfPeople();
        backRobbedMoneyProcess();
        System.out.println("RobbedMoney are backed!");
        printInformationOfPeople();
    }

    public void backRobbedMoney(int robbedMoney, String nationalCode) throws Exception {
        Connection connection = MySQLConnection.connectionSql();
        String sqlCmd = String.format("UPDATE people SET DigitalWallet=%s WHERE NationalCode = %s", AdminManagement.loadDigitalWallet(Integer.parseInt(nationalCode)) + robbedMoney, nationalCode);
        if (MySQLConnection.executeSQL(connection, sqlCmd)) {
            bankRobber.setWallet(bankRobber.getWallet() - robbedMoney);
            System.out.println("Update successfully!");
        } else
            System.out.println("Update not successfully!");
    }


    public void addAccountsToArrayList() throws Exception {
        int maxId = userManagement.getMaxAccountsID();
        for (int i = 1; i < maxId; i++)
            bankCustomersAccount.add(userManagement.loadAccount(i));
    }

    public void printInformationOfPeople() throws Exception {
        for (Account account : bankCustomersAccount)
            adminManagement.loadPeople(Integer.parseInt(account.getOwnerNationalCode()));
    }

    public void backRobbedMoneyProcess() throws Exception {
        for (Account account : bankCustomersAccount) {
            int robbedMoney = adminManagement.loadBalance(Integer.parseInt(account.getOwnerNationalCode()));
            backRobbedMoney(robbedMoney, account.getOwnerNationalCode());
        }
    }

    public void clearedAccountsByRobber(){
        for (Account account : bankCustomersAccount) {//خالی کردن حساب
            bankRobber.setWallet(account.getBalance() + bankRobber.getWallet());
            account.setBalance(0);
        }
    }
}
