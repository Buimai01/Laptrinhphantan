package Tuan5;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.StringTokenizer;

public class Server_Th2 {
    public static void main(String[] args) throws IOException {
        int serverPort = 2004;

        DatagramSocket serverSocket = new DatagramSocket(serverPort);
        System.out.println("Server is running and waiting....");

        byte[] receiveData = new byte[1024];
        DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
        serverSocket.receive(receivePacket);

        String operation = new String(receivePacket.getData(), 0, receivePacket.getLength());
        System.out.println("phép tính của client gửi lên là:  " + operation);

        StringTokenizer inputData = new StringTokenizer(operation);

        int number1 = Integer.parseInt(inputData.nextToken());
        String operator = inputData.nextToken();
        int number2 = Integer.parseInt(inputData.nextToken());

        int result = 0;

        switch (operator) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                result = number1 / number2;
                break;
            default:
                System.out.println("Phép tính gửi từ client không hợp lệ");
                break;
        }
        InetAddress clientAddress = receivePacket.getAddress();
        int clientPort = receivePacket.getPort();
        String dataConvertString = Integer.toString(result);

        DatagramPacket sendPacket = new DatagramPacket(dataConvertString.getBytes(), dataConvertString.length(), clientAddress, clientPort);

           serverSocket.send(sendPacket);
        System.out.println("Server đang gửi kết quả cho client...");
        serverSocket.close();
    }
}
