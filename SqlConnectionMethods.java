import java.sql.Connection;

public class SqlConnectionMethods {
    public void insertPeople(int iD,int nationalCode,int name,int age,int sex,int digitalWallet) throws Exception {
        Connection connection = MySQLConnection.connectionSql();
        String sqlCmd = String.format("INSERT INTO people (ID,NationalCode,Name,Age,Sex,DigitalWallet) values (%s,%s,'%s',%s,'%s',%s)", iD, nationalCode, name, age, sex , digitalWallet);
        if(MySQLConnection.executeSQL(connection,sqlCmd))
            System.out.println("insert successfully!");
        else
            System.out.println("insert not successfully!");

    }


}
