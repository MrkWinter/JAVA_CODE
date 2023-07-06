package com.mrkwinter6;

import java.io.IOException;
import java.net.*;

/**
 * @author MrkWinter
 * @version 1.0
 */
@SuppressWarnings("all")
public class SendSocket {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(9998);
        byte[] bytes = "hello,明天吃吃吃".getBytes();
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length,
                InetAddress.getByName("192.168.43.118"), 9999);
        socket.send(datagramPacket);

        byte[] bytes1 = new byte[1024];
        DatagramPacket datagramPacket1 = new DatagramPacket(bytes1, bytes1.length);
        socket.receive(datagramPacket1);
        int length = datagramPacket1.getLength();
        byte[] data = datagramPacket1.getData();
        String s = new String(data,0,length);
        System.out.println(s);
        socket.close();

    }
}
