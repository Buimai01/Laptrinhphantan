package Tuan4;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {
    public static void main(String[] args) throws IOException {
        int serverport = 1001;
        ServerSocket serverSocket = new ServerSocket(serverport);
        Socket socket = serverSocket.accept();

        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int readByte = inputStream.read(bytes);
        String[] numberArray = new String(bytes, 0, readByte).split(",");

        int result = 0;
        for (String number : numberArray) {
            result += Integer.parseInt(number);

            System.out.println(socket);
        }
    }
}
