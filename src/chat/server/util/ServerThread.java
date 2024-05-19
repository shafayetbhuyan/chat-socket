package chat.server.util;

import java.io.IOException;


public class ServerThread implements Runnable {

    Thread t;
    SocketUtil socketUtil;

    public ServerThread(SocketUtil socketUtil){
        this.socketUtil = socketUtil;
        this.t = new Thread(this);
        t.start();
    }

    @Override
    public void run(){
        while (! this.socketUtil.isClosed()){
            try {
                Object o = this.socketUtil.readSocket();
                System.out.println(o.toString());
                this.socketUtil.writeSocket("messege recived!");

            } catch (Exception e) {
//                e.printStackTrace();
                try {
                    this.socketUtil.closeSocket();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }
    }
}
