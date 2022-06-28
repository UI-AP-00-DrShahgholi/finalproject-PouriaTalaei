import java.util.Scanner;
import java.sql.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        MySQLConnection mySQLConnection = new MySQLConnection();
        //mySQLConnection.executeSQL();
//
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/registration", "root", "@Pouria1381");
//        String sqlCom = String.format("INSERT INTO people (ID,NationalCode,Name,Age,Sex,DigitalWallet) values (%s,%s,'%s',%s,'%s',%s)", 123, 12345, "pouria", 20, "male" , 5000000);
//        Statement statement = connection.prepareStatement(sqlCom);
//        statement.execute(sqlCom);
//        connection.close();


//        //if(mySQLConnection.executeSQL())
//            System.out.println("ok");
//        else System.out.println("no");

        //System.out.println("connected");

        //String name = input.next();
        //String family = input.next();
        //int id = 1;
        //String sex = "male";
        //int nationalCode = 1273889487;
        //int wallet = 1450000;
        //int age = 20;
    }
}
