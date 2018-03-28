package examples;

public class HelloServlet extends Servlet{
    public HelloServlet(){
        System.out.println("HelloServlet");
    }

    @Override
    public void init() {
        System.out.println("HelloServlet Init");
    }
    
    @Override
    public void service(HttpRequest request, HttpResponse response) {

    }
}
