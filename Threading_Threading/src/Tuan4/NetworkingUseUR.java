package Tuan4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class NetworkingUseUR {
    public static void main(String[] args) throws IOException {
        //tạo đối tượng url với địa chỉ web bất kỳ
        URL url = new URL("https://nettruyenco.vn/");
        //đọc dữ liệu từ url được mở
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
        //đọc dữ liệu từng dòng trên trang web đến hết
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        bufferedReader.close();
    }
}
