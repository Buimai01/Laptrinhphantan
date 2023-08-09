package Tuan4;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server3 {
    public static void main(String[] args) throws IOException {
        int serverPort = 2501;

       while (true) {
           ServerSocket serverSocket = new ServerSocket(serverPort);
           System.out.println("Server is running and waiting for connection...");

           Socket socket = serverSocket.accept();
           System.out.println("Hii");

           InputStream inputStream = socket.getInputStream();
           byte[] buffer = new byte[1024];
           int byteRead = inputStream.read(buffer);
           String message = new String(buffer, 0, byteRead);
           System.out.println("Message from client: " + message);

           socket.close();
           serverSocket.close();
       }
    }
}
