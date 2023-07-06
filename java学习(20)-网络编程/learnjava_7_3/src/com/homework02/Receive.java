package com.homework02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * @author MrkWinter
 * @version 1.0
 */
@SuppressWarnings("all")
public class Receive {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(8889);
        byte[] bytes = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);
        socket.receive(datagramPacket);
        int length = datagramPacket.getLength();
        byte[] data = datagramPacket.getData();
        String s = new String(data, 0, length);
        System.out.println(s);

        String received;
        if(s.equals("四大名著是那些")) {
            received = "红楼梦 三国演义 西游记 水浒传";
        } else  {
            received = "啊？";
        }
        byte[] bytes1 = received.getBytes();
        DatagramPacket datagramPacket1 = new DatagramPacket(bytes1, bytes1.length, InetAddress.getByName("192.168.43.118"), 8888);
        socket.send(datagramPacket1);

        socket.close();
    }
}
