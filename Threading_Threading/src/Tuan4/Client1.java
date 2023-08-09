package Tuan4;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Client1 {
    public static void main(String[] args) throws IOException {
        String serverIP = "127.0.0.1";
        int serverPort = 1001;
        Socket socket = new Socket(serverIP, serverPort);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập 2 số để tính tổng ");

        String number = "";
        System.out.println("Nhập số đầu tiên: ");
        number += scanner.next() + ", ";
        System.out.println("Nhập số thứ hai: ");
        number += scanner.next();

        System.out.println(number);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write(number.getBytes());

        socket.close();
    }
}
