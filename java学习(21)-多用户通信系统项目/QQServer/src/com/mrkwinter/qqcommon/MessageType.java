package com.mrkwinter.qqcommon;

/**
 * @author MrkWinter
 * @version 1.0
 */
public interface MessageType {
    String MESSAGE_LOGIN_SUCCEED = "1"; //表示登录成功
    String MESSAGE_LOGIN_FINAL = "2"; //表示登录失败
    String MESSAGE_PRIVATE_MES = "3";//表示私聊的信息包
    String MESSAGE_PUBLIC_MES = "4"; //表示群发的信息包
    String MESSAGE_GET_LIST = "5"; //表示获取在线用户列表
    String MESSAGE_RET_LIST = "6"; //表示返回在线用户列表
    String MESSAGE_CLIENT_EXIT = "7"; //表示客户端请求退出
    String MESSAGE_FILE_MES = "8"; //表示文件信息包
}