package examples;

import java.io.PrintWriter;

public class HelloServlet extends Servlet {
    public HelloServlet() {
        System.out.println("HelloServlet!!");
    }

    @Override
    public void service(HttpRequest req, HttpResponse res) {
        PrintWriter pw = res.getOut();

        pw.println("HTTP/1.1 200 OK");
        pw.println("Content-Type: text/html");
        pw.println();

        for(int i=0; i<5; i++){
            pw.print("*");
        }
        pw.flush();
    }
}
