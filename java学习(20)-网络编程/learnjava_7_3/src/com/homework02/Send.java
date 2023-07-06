package com.homework02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

/**
 * @author MrkWinter
 * @version 1.0
 */
@SuppressWarnings("all")
public class Send {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(8888);
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        byte[] bytes = next.getBytes();
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("192.168.43.118"), 8889);
        socket.send(datagramPacket);

        byte[] bytes1 = new byte[1024];
        DatagramPacket datagramPacket1 = new DatagramPacket(bytes1, bytes1.length);
        socket.receive(datagramPacket1);
        int length = datagramPacket1.getLength();
        byte[] data = datagramPacket1.getData();
        System.out.println(new String(data,0,length));

        socket.close();
    }
}
