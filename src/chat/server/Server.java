package chat.server;

import chat.common.Config;
import chat.server.util.ServerConfig;
import chat.server.util.ServerThread;
import chat.server.util.SocketUtil;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {

        try {

            // server started to listening
           ServerSocket serverSocket = new ServerSocket(Config.port);
            System.out.println("server has been started at port: " + Config.port);
            while (true){
                Socket socket = serverSocket.accept();
                SocketUtil socketUtil = new SocketUtil(socket);
                new ServerThread(socketUtil);
            }


        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
