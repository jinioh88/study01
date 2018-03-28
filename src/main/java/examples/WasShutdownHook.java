package examples;

public class WasShutdownHook extends Thread {
    private WebApplicationServer webApplicationServer;

    public WasShutdownHook(WebApplicationServer server){
        this.webApplicationServer = server;
    }

    public void run(){
        webApplicationServer.destroy();
        System.out.println("프로그램 리얼 종료!!");
    }
}
