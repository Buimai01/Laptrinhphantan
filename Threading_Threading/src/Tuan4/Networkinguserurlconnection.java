package Tuan4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Networkinguserurlconnection {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://nettruyenco.vn/");
        URLConnection urlConnection = url.openConnection();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
        String line;
        while ((line = bufferedReader.readLine()) !=null) {
            System.out.println(line);
        }
        bufferedReader.close();
    }
}
