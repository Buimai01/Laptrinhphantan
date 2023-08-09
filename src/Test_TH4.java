import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Test_TH4 {
    public static void main(String[] args) throws SQLException {
        ConnectJDBC connectJDBC = new ConnectJDBC();
        Connection connection = connectJDBC.connect();

        String query = "update users set passworduser = ? where id = ?";
        PreparedStatement pstm = null;
        try {
            pstm = connection.prepareStatement(query);
            pstm.setString(1, "tuan anh");
            pstm.setInt(2, 9);
            int row = pstm.executeUpdate();
            if (row !=0) {
                System.out.println("cap nhat thanh cong" + row);
            }
            connection.close();
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
