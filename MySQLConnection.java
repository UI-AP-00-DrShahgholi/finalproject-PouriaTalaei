import java.sql.*;

public class MySQLConnection {

    public static Connection connectionSql() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/registration", "root", "@Pouria1381");
        return connection;
    }

    public static boolean executeSQL(Connection connection, String sqlCmd) /*throws Exception*/ {
        //        try {
        //  Class.forName("com.mysql.cj.jdbc.Driver");
        //Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/registration", "root", "@Pouria1381");

        // String sqlCom = String.format("INSERT INTO people (ID,NationalCode,Name,Age,Sex,DigitalWallet) values (%s,%s,'%s',%s,'%s',%s)", 100, 200, "pouria", 20, "male" , 5000000);

        try {
            Statement statement = connection.prepareStatement(sqlCmd);
            statement.execute(sqlCmd);
            connection.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static ResultSet executeQuerySQL(Connection connection, String sqlCmd) /*throws Exception*/ {
        try {
            Statement statement = connection.prepareStatement(sqlCmd);
            //            while (resultSet.next()) {
//
//
//            }

            return statement.executeQuery(sqlCmd);

        } catch (Exception e) {
            return null;

        }
    }

    int getMaxID() throws SQLException {
        String sqlCmd = "Select Max(ID) from people";



    }
}
