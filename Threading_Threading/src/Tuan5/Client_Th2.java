package Tuan5;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Client_Th2 {
    public static void main(String[] args) throws IOException {
        String serverIP = "localhost";
        int serverPort = 2004;

        DatagramSocket clientSocket = new DatagramSocket();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập phép tính ( so_thu_1 operator so_thu_2): ");
        String input = sc.nextLine();

        if ("exit".equalsIgnoreCase(input)) {
            clientSocket.close();
        }
        InetAddress serverAddress = InetAddress.getByName(serverIP);
        byte[] sendData = input.getBytes();
        DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, serverPort);
        clientSocket.send(sendPacket);

        byte[] receiveData = new byte[65536];
        DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
        clientSocket.receive(receivePacket);

        String result = new String(receivePacket.getData(), 0, receivePacket.getLength());
        System.out.println("Kết quả là:" + result);

        clientSocket.close();
    }
}
