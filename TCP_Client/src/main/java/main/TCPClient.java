/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 *
 * @author SMART
 */
public class TCPClient {
    public static void main(String[] args) throws Exception{
        Socket socket = new Socket("localhost",6789);
        OutputStream outputStream = socket.getOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        outputStream.write("Salam Server, necesen?".getBytes());
        socket.close();
    }
}
