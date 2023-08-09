package Tuan4;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class tH3 {
    public static void main(String[] args) {
        try {
            InetAddress inetAddress = InetAddress.getByName("www.example.com");
            String ipAddress = inetAddress.getHostAddress();
            System.out.println("IP address:" + ipAddress);

            String hostName = inetAddress.getHostName();
            System.out.println("Host name:" + hostName);

            boolean reachable = inetAddress.isReachable(5000);
            System.out.println("Reachable: " + reachable);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
