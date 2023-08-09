package Tuan6;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Bt4 {
    public static void main(String[] args) throws SQLException {
        ConnectJDBC connectJDBC = new ConnectJDBC();
        Connection connection = connectJDBC.connect();

        String query = "delete from products where id = 4";
        Statement stm = null;
        stm = connection.createStatement();
        int row = stm.executeUpdate(query);
        if(row != 0) {
            System.out.println("Xoa thanh cong ");
        }
        connection.close();
    }
}
