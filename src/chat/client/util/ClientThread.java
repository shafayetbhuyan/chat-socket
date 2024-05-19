package chat.client.util;

import javafx.application.Platform;

import java.io.IOException;

public class ClientThread implements Runnable {

    Thread t;
    SocketUtil socketUtil;


    public ClientThread(SocketUtil socketUtil) {
        this.socketUtil = socketUtil;
//        Platform.runLater(this);
    }

    @Override
    public void run() {
        while (!this.socketUtil.isClosed()) {
            try {

                Object o = this.socketUtil.readSocket();
                System.out.println(o.toString());
            } catch (Exception e) {
                try {
                    this.socketUtil.closeSocket();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }
    }
}
