package org.txazo.network.socket.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

/**
 * ServerThread
 *
 * @author txazo
 * @email txazo1218@163.com
 * @since 02.06.2015
 */
public class ServerThread implements Runnable {

    private transient boolean isRunning;
    private Socket socket;
    private BufferedReader input;
    private PrintStream output;

    public ServerThread(Socket socket) {
        this.isRunning = true;
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            System.out.println("新的连接");

            /** 获取输入输出流 */
            input = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
            output = new PrintStream(socket.getOutputStream(), true, "UTF-8");

            /** 发送接受数据 */
            while (isRunning) {
                String data = input.readLine();
                System.out.println(data);
                if (data.equals("connect")) {
                    output.println("connect ok");
                } else if (data.equals("send")) {
                    output.println("reply");
                } else if (data.equals("close")) {
                    output.println("close ok");
                    isRunning = false;
                }
            }

            /** 关闭连接 */
            output.close();
            input.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
