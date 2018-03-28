package examples;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class IOExam05Server {
    public static void main(String[] args) throws Exception{
        ServerSocket server = new ServerSocket(9090);
        Socket socket = server.accept();

        InputStream in = socket.getInputStream();

        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String line = null;

        String fileName = br.readLine();
        PrintWriter pw = new PrintWriter(new FileWriter(fileName));
        while((line = br.readLine()) != null){
            if("quit".equals(line)){
                break;
            }
            pw.println(line);
        }
        pw.close();
        socket.close();
        server.close();

    }
}
