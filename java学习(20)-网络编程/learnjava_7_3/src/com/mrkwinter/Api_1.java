package com.mrkwinter;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.spec.RSAOtherPrimeInfo;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Api_1 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);//获取主机对象信息

        InetAddress host1 = InetAddress.getByName("www.baidu.com");
        System.out.println(host1);//根据主机名/域名获取主机/网站信息

        String hostAddress = host1.getHostAddress();
        System.out.println(hostAddress);//获取对象ip地址

        String hostName = host1.getHostName();
        System.out.println(hostName);//获取对象主机名/域名
    }
}
