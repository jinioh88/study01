package examples;

public abstract class Servlet {
    public void init(){

    }

    public void service(HttpRequest req, HttpResponse res){
        if("GET".equals(req.getMethod())){
            doGet(req,res);
        } else if("POST".equals(req.getMethod())){
            doPost(req,res);
        }
    }

    public void destroy(){

    }

    public void doGet(HttpRequest req, HttpResponse res){

    }

    public void doPost(HttpRequest req, HttpResponse res){

    }
}
