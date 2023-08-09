import java.io.IOException;
import java.sql.*;

public class ConnectJDBC {
    private String hostName = "localhost:3306";
    private String dbName = "demo_jdbc";
    private String userName = "root";
    private String passWord = "1";
    private String connectionURL = "jdbc:mysql://"+hostName+"/"+dbName;

    public Connection connect() throws SQLException {
        java.sql.Connection connection = null;

        connection = DriverManager.getConnection(connectionURL, userName, passWord);

        if (connection != null) {
            System.out.println("Ket noi thanh cong!");
        }

        return connection;


    }

    public static void main(String[] args) throws SQLException {
            ConnectJDBC connectJDBC = new ConnectJDBC();
            Connection connection = connectJDBC.connect();;
            String query = "SELECT * FROM users";

        Statement stm = null;
        try {
            stm = connection.createStatement();

            ResultSet rs = stm.executeQuery(query);

            while (rs.next()) {
            int id = rs.getInt("Id");
            String userName = rs.getString("username");
            String passworduser = rs.getString("passworduser");
            String email = rs.getString("email");
                System.out.println(id + "-" + userName + "-" + passworduser + "-" + email);
            }
            connection.close();
        }catch (SQLException e ){
            e.printStackTrace();
        }
    }
}

