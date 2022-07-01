import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminManagement {

    public void insertPeople(int nationalCode, String name, int age, String sex, int digitalWallet) throws Exception {
        Connection connection = MySQLConnection.connectionSql();
        String sqlCmd = String.format("INSERT INTO people (ID,NationalCode,Name,Age,Sex,DigitalWallet) values (%s,%s,'%s',%s,'%s',%s)", getMaxPeopleID() + 1, nationalCode, name, age, sex, digitalWallet);
        if (MySQLConnection.executeSQL(connection, sqlCmd))
            System.out.println("insert successfully!");
        else
            System.out.println("insert not successfully!");
    }

    public void updatePeople(int iD, int nationalCode, String name, int age, String sex, int digitalWallet) throws Exception {
        Connection connection = MySQLConnection.connectionSql();
        String sqlCmd = String.format("UPDATE people SET NationalCode=%s , Name ='%s',Age =%s,Sex='%s',DigitalWallet=%s WHERE ID = %s", nationalCode, name, age, sex, digitalWallet, iD);
        if (MySQLConnection.executeSQL(connection, sqlCmd))
            System.out.println("Update successfully!");
        else
            System.out.println("Update not successfully!");
    }

    public void deletePeople(int iD) throws Exception {
        Connection connection = MySQLConnection.connectionSql();
        String sqlCmd = String.format("DELETE from people WHERE ID = %s", iD);
        if (MySQLConnection.executeSQL(connection, sqlCmd))
            System.out.println("Delete successfully!");
        else
            System.out.println("Delete not successfully!");
    }

    public void loadPeople(int nationalCode) throws Exception {
        Connection connection = MySQLConnection.connectionSql();
        String sqlCmd = String.format("SELECT * from people WHERE NationalCode =%s", nationalCode);
        ResultSet resultSet = MySQLConnection.executeQuerySQL(connection, sqlCmd);
        Person person;
        if (resultSet.next()) {
            person = setPerson(resultSet);
            printPerson(person);
        }
    }

    public Person setPerson(ResultSet resultSet) throws SQLException {
        Person person;
        person = new Person();
        person.setNationalCode(resultSet.getInt("NationalCode"));
        person.setName(resultSet.getString("Name"));
        person.setAge(resultSet.getInt("Age"));
        person.setSex(resultSet.getString("Sex"));
        person.setWallet(resultSet.getInt("DigitalWallet"));
        return person;
    }

    public void printPerson(Person person) {
        System.out.println("National Code : " + person.getNationalCode());
        System.out.println("Name : " + person.getName());
        System.out.println("Age : " + person.getAge());
        System.out.println("Sex : " + person.getSex());
        System.out.println("Digital Wallet Balance : " + person.getWallet());
    }

    public static int loadDigitalWallet(int nationalCode) throws Exception {
        Connection connection = MySQLConnection.connectionSql();
        String sqlCmd = String.format("SELECT DigitalWallet from people WHERE NationalCode=%s", nationalCode);
        ResultSet resultSet = MySQLConnection.executeQuerySQL(connection, sqlCmd);
        if (resultSet.next()) {
            return resultSet.getInt(1);
        }
        return 0;
    }

    public static int loadBalance(String nationalCode) throws Exception {
        Connection connection = MySQLConnection.connectionSql();
        String sqlCmd = String.format("SELECT Balance from accounts WHERE OwnerNationalCode='%s'", nationalCode);
        ResultSet resultSet = MySQLConnection.executeQuerySQL(connection, sqlCmd);
        if (resultSet.next()) {
            return resultSet.getInt(1);
        }
        return 0;
    }

    public static int loadCost(int nationalCode) throws Exception {
        Connection connection = MySQLConnection.connectionSql();
        String sqlCmd = String.format("SELECT Cost from estate WHERE OwnerNationalCode=%s", nationalCode);
        ResultSet resultSet = MySQLConnection.executeQuerySQL(connection, sqlCmd);
        if (resultSet.next()) {
            return resultSet.getInt(1);
        }
        return 0;
    }

    public void updateWalletAfterSell(int ownerNationalCode) throws Exception {
        Connection connection = MySQLConnection.connectionSql();
        String sqlCmd = String.format("UPDATE people SET DigitalWallet =%s WHERE NationalCode=%s", AdminManagement.loadDigitalWallet(ownerNationalCode) + loadCost(ownerNationalCode), ownerNationalCode);
        if (MySQLConnection.executeSQL(connection, sqlCmd)) {
            System.out.println("Update successfully!");
        } else
            System.out.println("Update not successfully!");
    }

    public void insertEstate(int documentRegistrationCode, int ownerNationalCode, String address, String purchaseDate, int cost) throws Exception {
        Connection connection = MySQLConnection.connectionSql();
        String sqlCmd = String.format("INSERT INTO estate (ID,DocumentRegistrationCode,OwnerNationalCode,Address,PurchaseDate,Cost) values (%s,%s,%s,'%s','%s',%s)", getMaxEstateID() + 1, documentRegistrationCode, ownerNationalCode, address, purchaseDate, cost);
        if (MySQLConnection.executeSQL(connection, sqlCmd))
            System.out.println("insert successfully!");
        else
            System.out.println("insert not successfully!");
    }

    public void updateEstate(int id, int documentRegistrationCode, int ownerNationalCode, String address, String purchaseDate, int cost) throws Exception {
        Connection connection = MySQLConnection.connectionSql();
        String sqlCmd = String.format("UPDATE estate SET DocumentRegistrationCode=%s , OwnerNationalCode =%s,Address ='%s',PurchaseDate='%s',Cost=%s WHERE ID = %s", documentRegistrationCode, ownerNationalCode, address, purchaseDate, cost, id);
        if (MySQLConnection.executeSQL(connection, sqlCmd))
            System.out.println("Update successfully!");
        else
            System.out.println("Update not successfully!");
    }

    public void deleteEstate(int ownerNationalCode) throws Exception {
        updateWalletAfterSell(ownerNationalCode);
        Connection connection = MySQLConnection.connectionSql();
        String sqlCmd = String.format("DELETE from estate WHERE OwnerNationalCode = %s", ownerNationalCode);
        if (MySQLConnection.executeSQL(connection, sqlCmd))
            System.out.println("Delete successfully!");
        else
            System.out.println("Delete not successfully!");
    }

    public void loadEstate(int iD) throws Exception {
        Connection connection = MySQLConnection.connectionSql();
        String sqlCmd = String.format("SELECT * from estate WHERE ID =%s", iD);
        ResultSet resultSet = MySQLConnection.executeQuerySQL(connection, sqlCmd);
        Estate estate;
        if (resultSet.next()) {
            estate = setEstate(resultSet);
            printEstate(estate);
        }
    }

    public Estate setEstate(ResultSet resultSet) throws SQLException {
        Estate estate;
        estate = new Estate();
        estate.setDocumentRegistrationCode(Integer.parseInt(resultSet.getString("DocumentRegistrationCode")));
        estate.setOwnerNationalCode(Integer.parseInt(resultSet.getString("OwnerNationalCode")));
        estate.setAddress(resultSet.getString("Address"));
        estate.setPurchaseDate(resultSet.getString("PurchaseDate"));
        estate.setCost(Integer.parseInt(resultSet.getString("Cost")));
        return estate;
    }

    public void printEstate(Estate estate) {
        System.out.println("Document Registration Code : " + estate.getDocumentRegistrationCode());
        System.out.println("OwnerNationalCode : " + estate.getOwnerNationalCode());
        System.out.println("Address : " + estate.getAddress());
        System.out.println("PurchaseDate : " + estate.getPurchaseDate());
        System.out.println("Cost : " + estate.getCost());
    }

    public int getMaxPeopleID() throws Exception {
        Connection connection = MySQLConnection.connectionSql();
        String sqlCmd = "SELECT MAX(ID) from people";
        ResultSet resultSet = MySQLConnection.executeQuerySQL(connection, sqlCmd);
        if (resultSet.next()) {
            return resultSet.getInt(1);
        } else return 0;
    }

    public int getMaxEstateID() throws Exception {
        Connection connection = MySQLConnection.connectionSql();
        String sqlCmd = "SELECT MAX(ID) from estate";
        ResultSet resultSet = MySQLConnection.executeQuerySQL(connection, sqlCmd);
        if (resultSet.next()) {
            return resultSet.getInt(1);
        } else return 0;
    }
}