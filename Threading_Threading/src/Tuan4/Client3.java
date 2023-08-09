package Tuan4;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client3 {
    public static void main(String[] args) throws IOException {
        String serverIP = "127.0.0.1";
        int serverPort = 2501;

        while (true) {
            Socket socket = new Socket(serverIP, serverPort);

            OutputStream outputStream = socket.getOutputStream();
            String message = "hello";
            outputStream.write(message.getBytes());
            socket.close();
        }
    }
}
