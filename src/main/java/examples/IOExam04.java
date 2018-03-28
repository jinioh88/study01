package examples;

import java.io.*;

public class IOExam04 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        while((line=br.readLine())!=null){
            if("quit".equals(line))
                break;
            System.out.println(line);

        }
    }
}
