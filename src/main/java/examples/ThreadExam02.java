package examples;

public class ThreadExam02 {
    public static void main(){
        Thread t1 = new Thread(new MyThread02("*"));
        Thread t2 = new Thread(new MyThread02("-"));
        Thread t3 = new Thread(new MyThread02("+"));

        t1.start();
        t2.start();
        t3.start();
    }
}

class MyThread02 implements Runnable{
    private String name;
    public MyThread02(String name){
        this.name = name;
    }

    @Override
    public void run() {
        for(int i = 0; i <= 10; i++){
            System.out.print(name);
            try { // 0 <= x < 1000
                Thread.sleep((int) (Math.random() * 1000));
            }catch(Exception ex){}
        }
    }
}
