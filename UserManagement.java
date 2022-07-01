import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserManagement {

    public void insertAccounts(String accountNumber, String ownerNationalCode, int balance, String dateOfOpeningAccount) throws Exception {
        Connection connection = MySQLConnection.connectionSql();
        String sqlCmd = String.format("INSERT INTO accounts (ID,AccountNumber,OwnerNationalCode,Balance,DateOfOpeningAccount,NegativePoint) values (%s,'%s','%s',%s,'%s',%s)", getMaxAccountsID() + 1, accountNumber, ownerNationalCode, balance, dateOfOpeningAccount, 0);
        if (MySQLConnection.executeSQL(connection, sqlCmd))
            System.out.println("insert successfully!");
        else
            System.out.println("insert not successfully!");
    }

    public void updateAccounts(int iD, String accountNumber, String ownerNationalCode, int balance, String dateOfOpeningAccount, int negativePoint) throws Exception {
        Connection connection = MySQLConnection.connectionSql();
        String sqlCmd = String.format("UPDATE accounts SET AccountNumber='%s' , OwnerNationalCode ='%s',Balance =%s,DateOfOpeningAccount='%s',NegativePoint=%s WHERE ID = %s", accountNumber, ownerNationalCode, balance, dateOfOpeningAccount, negativePoint, iD);
        if (MySQLConnection.executeSQL(connection, sqlCmd))
            System.out.println("Update successfully!");
        else
            System.out.println("Update not successfully!");
    }

    public Account loadAccount(int iD) throws Exception {
        Connection connection = MySQLConnection.connectionSql();
        String sqlCmd = String.format("SELECT * from accounts WHERE ID =%s", iD);
        ResultSet resultSet = MySQLConnection.executeQuerySQL(connection, sqlCmd);
        Account account;
        if (resultSet.next()) {
            account = setAccount(resultSet);
            return account;
        }
        return null;
    }

    public Account setAccount(ResultSet resultSet) throws SQLException {
        Account account;
        account = new Account();
        account.setAccountNumber(resultSet.getString("AccountNumber"));
        account.setOwnerNationalCode(resultSet.getString("OwnerNationalCode"));
        account.setBalance(Integer.parseInt(resultSet.getString("Balance")));
        account.setDateOfOpeningAccount(resultSet.getString("DateOfOpeningAccount"));
        account.setNegativePoint(Integer.parseInt(resultSet.getString("NegativePoint")));
        return account;
    }

    public void printAccount(Account account) {
        System.out.println("Account Number : " + account.getAccountNumber());
        System.out.println("Owner National Code : " + account.getOwnerNationalCode());
        System.out.println("Balance : " + account.getBalance());
        System.out.println("Date Of Opening Account : " + account.getDateOfOpeningAccount());
        System.out.println("Negative Point : " + account.getNegativePoint());
    }

    public int getMaxAccountsID() throws Exception {
        Connection connection = MySQLConnection.connectionSql();
        String sqlCmd = "SELECT MAX(ID) from accounts";
        ResultSet resultSet = MySQLConnection.executeQuerySQL(connection, sqlCmd);
        if (resultSet.next()) {
            return resultSet.getInt(1);
        } else return 0;
    }
}
