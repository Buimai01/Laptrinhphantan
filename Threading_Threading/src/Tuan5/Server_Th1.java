package Tuan5;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Server_Th1 {
    public static void main(String[] args) throws IOException {
        int serverPort = 12345;

        //tạo đối tượng datagramSocket để liên kết với một cổng
        DatagramSocket serverSocket = new DatagramSocket(serverPort);
        System.out.println("Server is running and waiting for client...");

        //tạo mảng byte để nhận dữ liệu từ gói tin nhận được
        byte[] receiveData = new byte[1024];
        //tạo đối tượng datagramPacket để nhận gói tin từ client
        DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);

        //nhận gói tin từ client
        serverSocket.receive(receivePacket);

        //lấy địa chỉ IP và cổng của client
        InetAddress clientAddress = receivePacket.getAddress();
        int clientPort = receivePacket.getPort();

        //chuyển đổi dữ liệu thành dạng chuỗi
        String message = new String(receivePacket.getData(), 0, receivePacket.getLength());
        System.out.println("Received from client: " + message);

        //chuẩn bị dữ liệu gửi đi
        String responseMessage = "Hello, client ";
        byte[] sendData = responseMessage.getBytes();

        //tạo datapacket để gửi gói tin đến client
        DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, clientAddress, clientPort);
        //gửi gói tin đến client
        serverSocket.send(sendPacket);

        serverSocket.close();

    }
}
