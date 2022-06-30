import java.sql.Connection;
import java.sql.ResultSet;

public class Deposit {


    public void depositProcess(String ownerNationalCode,String accountNumber, int balance) throws Exception {
        Connection connection = MySQLConnection.connectionSql();
        String sqlCmd1 = String.format("UPDATE accounts SET Balance =%s WHERE  OwnerNationalCode ='%s' and AccountNumber='%s'", balance,ownerNationalCode,accountNumber);
        if (MySQLConnection.executeSQL(connection, sqlCmd1)) {
            String sqlCmd2 = String.format("UPDATE people SET DigitalWallet =%s WHERE NationalCode=%s",loadDigitalWallet(Integer.parseInt(ownerNationalCode))-balance,ownerNationalCode);
            System.out.println("Update successfully!");
        }
        else
            System.out.println("Update not successfully!");
    }


    public int loadDigitalWallet(int nationalCode) throws Exception {
        Connection connection = MySQLConnection.connectionSql();
        String sqlCmd = String.format("SELECT DigitalWallet from people WHERE NationalCode=%s",nationalCode);
        ResultSet resultSet = MySQLConnection.executeQuerySQL(connection, sqlCmd);
        return resultSet.getInt(1);
    }



}
