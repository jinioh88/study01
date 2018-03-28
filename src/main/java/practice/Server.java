package practice;

import examples.Client;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try(
                ServerSocket lister = new ServerSocket(8080);
                Socket client = lister.accept();
                InputStream input = client.getInputStream();
                InputStreamReader ir = new InputStreamReader(input);
                BufferedReader br = new BufferedReader(ir);

                OutputStream out = client.getOutputStream();
                PrintWriter pw = new PrintWriter(out);

        ){
            String line = "";
            while((line = br.readLine()) != null){
                pw.println(line);
                pw.flush();
            }
        } catch(Exception e){
            e.printStackTrace();
        } finally {

        }
    }

}
