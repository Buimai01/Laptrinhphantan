package Tuan6;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Bt5 {
    public static void main(String[] args) throws SQLException {
        ConnectJDBC connectJDBC = new ConnectJDBC();
        Connection connection = connectJDBC.connect();

        String query = "select * from products";
        Statement stm = null;
        stm = connection.createStatement();
        ResultSet rs = stm.executeQuery(query);

        while (rs.next()) {
            int id = rs.getInt("id");
            String name_product = rs.getString("name_product");
            Double price = rs.getDouble("price");
            String detail = rs.getString("detail");
            String manufacturer = rs.getString("manufacturer");
            Double number_product = rs.getDouble("number_product");
            Double status_product = rs.getDouble("status_product");
            System.out.println(id + "-" + name_product + "-" + price + "-" + detail + "-" + manufacturer + "-" + number_product + "-" + status_product) ;
        }
        connection.close();
    }
}
