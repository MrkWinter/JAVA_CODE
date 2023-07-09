package com.mrkwinter.qqcommon;

import java.io.Serializable;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Message implements Serializable {
    private static final long serialVersionUID = 1L;
    private String senderName;
    private String getterName;
    private String sendTime;
    private String content;
    private String messageType;

    //传输文件相关的属性
    private String src;
    private String dest;
    private byte[] bytes;
    private int fileLength;


    public Message() {
    }
    public Message(String senderName, String getterName, String sendTime, String content, String messageType) {
        this.senderName = senderName;
        this.getterName = getterName;
        this.sendTime = sendTime;
        this.content = content;
        this.messageType = messageType;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getGetterName() {
        return getterName;
    }

    public void setGetterName(String getterName) {
        this.getterName = getterName;
    }

    public String getSendTime() {
        return sendTime;
    }

    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public byte[] getBytes() {
        return bytes;
    }

    public void setBytes(byte[] bytes) {
        this.bytes = bytes;
    }

    public int getFileLength() {
        return fileLength;
    }

    public void setFileLength(int fileLength) {
        this.fileLength = fileLength;
    }
}
