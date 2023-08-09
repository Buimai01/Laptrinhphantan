package Tuan6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectJDBC {
    private String hostName = "localhost:3306";
    private String dbName = "product_manager";
    private String userName = "root";
    private String password = "1";
    private String connectionURL = "jdbc:mysql://" + hostName +"/" + dbName;

    public Connection connect() throws SQLException {
        java.sql.Connection connection = null;

        connection = DriverManager.getConnection(connectionURL, userName, password);

        if (connection != null) {
            System.out.println("Ket noi thanh cong!");
        }

        return connection;
    }

    public static void main(String[] args) throws SQLException {
        ConnectJDBC connectJDBC = new ConnectJDBC();
        Connection connection = connectJDBC.connect();
    }

}
