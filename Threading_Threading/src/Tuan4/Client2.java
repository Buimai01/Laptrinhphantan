package Tuan4;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client2 {
    public static void main(String[] args) throws IOException {
        String ip = "127.0.0.1";
        int serverPort = 69;
        Socket socket = new Socket(ip, serverPort);

        Scanner scanner = new Scanner(System.in);
    }
}
