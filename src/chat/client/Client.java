package chat.client;

import chat.client.util.ClientConfig;
import chat.client.util.ClientThread;
import chat.client.util.SocketUtil;
import chat.common.Config;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {

        try {

            //client initiate communication with server
            Socket socket = new Socket(ClientConfig.host, Config.port);
            SocketUtil socketUtil = new SocketUtil(socket);

            new Thread(new ClientThread(socketUtil)).start();

            Scanner scanner = new Scanner(System.in);
            String userInput;
            while (true) {
                userInput = scanner.nextLine();
                socketUtil.writeSocket(userInput);
            }


        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
