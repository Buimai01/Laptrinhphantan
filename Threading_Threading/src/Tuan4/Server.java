package Tuan4;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        int serverPort = 8080;

        try {
            ServerSocket serverSocket = new ServerSocket(serverPort);
            System.out.println("server is running and waiting for connection....");

            Socket socket = serverSocket.accept();
            System.out.println("Client connected ");

            InputStream inputStream = socket.getInputStream();
            byte[] buffer = new byte[1024];
            int byteRead = inputStream.read(buffer);
            String message = new String(buffer, 0, byteRead);
            System.out.println("Receive message from client: " + message);

            socket.close();
            serverSocket.close();
        }catch (IOException e ){
            e.printStackTrace();
        }
    }
}
