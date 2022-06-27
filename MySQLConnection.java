import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MySQLConnection {
    boolean executeSQL(String sqlCmd) throws Exception {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/registration", "root", "@Pouria1381");
            String sqlCom = String.format("INSERT INTO people (ID,NationalCode,Name,Age,Sex,DigitalWallet) values (%s,%s,'%s',%s,'%s',%s)", id, nationalCode, name, age, sex, wallet);
            Statement statement = connection.prepareStatement(sqlCom);
            statement.execute(sqlCom);
            connection.close();
            return true;
        }catch (Exception e){

            return false;
        }
    }

}
