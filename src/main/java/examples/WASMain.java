package examples;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class WASMain {
    public static void main(String[] args){
        // 메인에 있던 코드를 객체로 만들어 옮겨놓음. 이제 어디서든 was실행하고프면 이 객체만 생성하믄 됨
        WebApplicationServer was = new WebApplicationServer(8080);
        new Thread(was).start();

    }
}
