package com.linzg.www.androidinternet;

import java.net.DatagramSocket;
import java.net.MulticastSocket;



public class ServerConnect extends Thread {
    private DatagramSocket sendSoket = null;       //向发出组播的客户端发送UDP数据
    private MulticastSocket mMs = null;     //接受客户端的组播
    public ServerConnect(){

    }
}
