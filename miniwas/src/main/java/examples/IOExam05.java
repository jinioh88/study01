package examples;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class IOExam05 {
    public static void main(String[] args) throws Exception{
        Socket socket = new Socket("127.0.0.1", 9090);
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(socket.getOutputStream());
        String line = null;
        String fileName = br.readLine();
        pw.println(fileName);
        pw.flush();

        while((line = br.readLine()) != null){
            pw.println(line);
            pw.flush();
            if("quit".equals(line))
                break;
        }
        pw.close();
    }
}
