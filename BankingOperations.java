import java.sql.Connection;

public class BankingOperations {
    public void depositProcess(String ownerNationalCode, String accountNumber, int money) throws Exception {
        Connection connection = MySQLConnection.connectionSql();
        String sqlCmd1 = String.format("UPDATE accounts SET Balance =%s WHERE  OwnerNationalCode ='%s' and AccountNumber='%s'", money + AdminManagement.loadBalance(ownerNationalCode), ownerNationalCode, accountNumber);
        if (MySQLConnection.executeSQL(connection, sqlCmd1)) {
            String sqlCmd2 = String.format("UPDATE people SET DigitalWallet =%s WHERE NationalCode=%s", AdminManagement.loadDigitalWallet(Integer.parseInt(ownerNationalCode)) - money, ownerNationalCode);
            if (MySQLConnection.executeSQL(connection, sqlCmd2))
                System.out.println("Update successfully!");
        } else
            System.out.println("Update not successfully!");
    }

    public void withdrawProcess(String ownerNationalCode, String accountNumber, int money) throws Exception {
        Connection connection = MySQLConnection.connectionSql();
        String sqlCmd1 = String.format("UPDATE accounts SET Balance =%s WHERE  OwnerNationalCode ='%s' and AccountNumber='%s'", AdminManagement.loadBalance(ownerNationalCode) - money, ownerNationalCode, accountNumber);
        if (MySQLConnection.executeSQL(connection, sqlCmd1)) {
            String sqlCmd2 = String.format("UPDATE people SET DigitalWallet =%s WHERE NationalCode=%s", AdminManagement.loadDigitalWallet(Integer.parseInt(ownerNationalCode)) + money, ownerNationalCode);
            if (MySQLConnection.executeSQL(connection, sqlCmd2))
                System.out.println("Update successfully!");
        } else
            System.out.println("Update not successfully!");
    }

    public void moneyTransfer(String originOwnerNationalCode, String originAccountNumber, String destinationOwnerNationalCode, String destinationAccountNumber, int money) throws Exception {
        Connection connection = MySQLConnection.connectionSql();
        String sqlCmd1 = String.format("UPDATE accounts SET Balance =%s WHERE  OwnerNationalCode ='%s' and AccountNumber='%s'", AdminManagement.loadBalance(originOwnerNationalCode) - money, originOwnerNationalCode, originAccountNumber);
        if (MySQLConnection.executeSQL(connection, sqlCmd1)) {
            String sqlCmd2 = String.format("UPDATE accounts SET Balance =%s WHERE  OwnerNationalCode ='%s' and AccountNumber='%s'", AdminManagement.loadBalance(destinationOwnerNationalCode) + money, destinationOwnerNationalCode, destinationAccountNumber);
            if (MySQLConnection.executeSQL(connection, sqlCmd2))
                System.out.println("Update successfully!");
        } else
            System.out.println("Update not successfully!");
    }
}
