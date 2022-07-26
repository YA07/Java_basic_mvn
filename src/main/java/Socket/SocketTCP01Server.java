package Socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketTCP01Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("监听中。。。");

        Socket socket = serverSocket.accept();

        System.out.println("服务器端scoket = "+socket.getClass());

        InputStream inputStream = socket.getInputStream();

        byte[] buf = new byte[1024];
        int readlen=0;
        while ((readlen = inputStream.read(buf))!= -1){
            System.out.println(new String(buf,0,readlen));
        }

        inputStream.close();
        socket.close();
        serverSocket.close();
    }
}
