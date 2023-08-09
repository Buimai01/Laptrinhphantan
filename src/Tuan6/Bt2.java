package Tuan6;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Bt2 {
    public static void main(String[] args) throws SQLException {
        ConnectJDBC connectJDBC = new ConnectJDBC();
        Connection connection = connectJDBC.connect();

        String query = "insert into products(id, name_product, price, detail, manufacturer, number_product, status_product)" + "values(6, 'banh bong lan trung muoi', 25.000, 'Thanh phan: bot, nuoc, duong', 'tiem banh', 15, true)";
        Statement stm = null;
        stm = connection.createStatement();
        int row = stm.executeUpdate(query);
        if(row != 0) {
            System.out.println("Them thanh cong ");
        }
        connection.close();
    }
}
