package Tuan6;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Bt3 {
    public static void main(String[] args) throws SQLException {
        ConnectJDBC connectJDBC = new ConnectJDBC();
        Connection connection = connectJDBC.connect();

        String query = "update products set detail = 'Thanh phan: nuoc, cacao, duong' where id = 4";
        Statement stm = null;

        stm = connection.createStatement();
        int row = stm.executeUpdate(query);
        if(row != 0) {
            System.out.println("Cap nhat thanh cong ");
        }
        connection.close();
    }
}
