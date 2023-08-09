import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Test_TH2 {
    public static void main(String[] args) throws SQLException {
        ConnectJDBC connectJDBC = new ConnectJDBC();
        Connection connection = connectJDBC.connect();

        String query = "insert into users(id, username, passworduser, email) " + "values(?,?,?,?)";
        PreparedStatement pstm = null;
        try {
            pstm = connection.prepareStatement(query);

            pstm.setInt(1, 5);
            pstm.setString(2, "Bui Thi Mai");
            pstm.setString(3, "123456789");
            pstm.setString(4, "buimai@gmail.com");
            int row = pstm.executeUpdate();
            if (row != 0) {
                System.out.println("Them thanh cong" + row);
            }
            connection.close();
        }catch (SQLException e ) {
            e.printStackTrace();
        }
    }
}
