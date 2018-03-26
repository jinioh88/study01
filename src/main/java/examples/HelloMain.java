package examples;

public class HelloMain {
    public static void main(String[] args) throws Exception {

        //hello가 100개까지 증가할 경우 코드는 안바뀐다.
        for(int i=1;i<2;i++){
            String className1 = "examples.Hello"+i;
            Class clazz = Class.forName(className1);

            Hello h = (Hello)clazz.newInstance();
            h.hello();

        }
    }
}
