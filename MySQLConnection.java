import java.sql.*;

public class MySQLConnection {

    public static Connection connectionSql() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/registration", "root", "@Pouria1381");
    }

    public static boolean executeSQL(Connection connection, String sqlCmd) /*throws Exception*/ {
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
            return statement.executeQuery(sqlCmd);
        } catch (Exception e) {
            return null;
        }
    }
}
