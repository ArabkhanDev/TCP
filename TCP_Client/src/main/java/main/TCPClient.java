/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import util.FileUtility;

/**
 *
 * @author SMART
 */
public class TCPClient {
    public static void main(String[] args) throws Exception{
        Socket socket = new Socket("192.168.0.110",5678);
        OutputStream outputStream = socket.getOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        
        byte[] bytes = FileUtility.readBytes("C:\\SekilBMW\\bmw.jpg");
        dataOutputStream.writeInt(bytes.length);
        dataOutputStream.write(bytes);
        socket.close();
    }
}