import java.sql.Connection;

public class SqlConnectionMethods {
    public void insertPeople(int iD, int nationalCode, int name, int age, int sex, int digitalWallet) throws Exception {
        Connection connection = MySQLConnection.connectionSql();
        String sqlCmd = String.format("INSERT INTO people (ID,NationalCode,Name,Age,Sex,DigitalWallet) values (%s,%s,'%s',%s,'%s',%s)", iD, nationalCode, name, age, sex, digitalWallet);
        if (MySQLConnection.executeSQL(connection, sqlCmd))
            System.out.println("insert successfully!");
        else
            System.out.println("insert not successfully!");

    }

    public void updatePeople(int iD, int nationalCode, int name, int age, int sex, int digitalWallet) throws Exception {
        Connection connection = MySQLConnection.connectionSql();
        String sqlCmd = String.format("UPDATE people SET NationalCode=%s , Name ='%s',Age =%s,Sex='%s',DigitalWallet=%s WHERE ID = %s", nationalCode, name, age, sex, digitalWallet, iD);
        if (MySQLConnection.executeSQL(connection, sqlCmd))
            System.out.println("Update successfully!");
        else
            System.out.println("update not successfully!");
    }

    public void deletePeople(int iD) throws Exception {
        Connection connection = MySQLConnection.connectionSql();
        String sqlCmd = String.format("DELETE from people WHERE ID = %s",iD);
        if (MySQLConnection.executeSQL(connection, sqlCmd))
            System.out.println("Delete successfully!");
        else
            System.out.println("Delete not successfully!");
    }


    public void getMaxID() throws Exception {


    }


}
