package Test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException {
        int serverPort = 2004;

        DatagramSocket serverSocket = new DatagramSocket(serverPort);
        System.out.println("Server is running and waiting....");
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap tin nhan");
            String receiveMessage = sc.nextLine();
            if ("exit".equalsIgnoreCase(receiveMessage)) {
                serverSocket.close();
                break;
            }
                byte[] receiveData = new byte[1024];

                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                serverSocket.receive(receivePacket);

                InetAddress clientAddress = receivePacket.getAddress();
                int clientPort = receivePacket.getPort();

                String message = new String(receivePacket.getData(), 0, receivePacket.getLength());
                System.out.println("Receive from client: " + message);

                byte[] sendData = receiveMessage.getBytes();
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, clientAddress, clientPort);

                serverSocket.send(sendPacket);

            }
        }
    }