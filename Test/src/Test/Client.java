package Test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        String serverIP = "192.168.";
        int serverPort = 2004;
        while (true) {
            DatagramSocket clientSocket = new DatagramSocket();

            Scanner sc = new Scanner(System.in);
            System.out.println("nhap tin nhan");
            String message = sc.nextLine();
            if ("exit".equalsIgnoreCase(message)) {
                clientSocket.close();
                break;
            }

            byte[] sendData = message.getBytes();

            InetAddress serveraddress = InetAddress.getByName(serverIP);
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serveraddress, serverPort);
            clientSocket.send(sendPacket);

            byte[] receiveData = new byte[1024];
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            clientSocket.receive(receivePacket);

            String receiveMessage = new String(receivePacket.getData(), 0, receivePacket.getLength());
            System.out.println("Receive from server: " + receiveMessage);

        }
    }
}
