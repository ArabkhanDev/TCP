/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tcpserver;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author SMART
 */
public class TCPServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

        ServerSocket ourFirstServerSocket = new ServerSocket(6789);
        while (true) {
            System.out.println("Yeni socket ucun ve ya bashqa sozle desek yeni musteri ucun gozleyirem...");
            Socket connection = ourFirstServerSocket.accept();
            System.out.println("Urra yeni musteri geldi...");
            InputStream is = connection.getInputStream();
            InputStreamReader reader = new InputStreamReader(is);
            BufferedReader bReader = new BufferedReader(reader);

            String messageFromClient = bReader.readLine();
            System.out.println("musteri deyir ki:" + messageFromClient);
        }
    }

}
