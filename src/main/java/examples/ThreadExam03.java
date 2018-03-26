package examples;

public class ThreadExam03 {
    public static void main(String[] args){
        Cube cube = new Cube();
        MyTheread3 t1 = new MyTheread3(cube,1);
        MyTheread3 t2 = new MyTheread3(cube,2);
        MyTheread3 t3 = new MyTheread3(cube,3);
        t1.start();
        t2.start();
        t3.start();
    }
}

class Cube {
    public void a() {
        for (int i = 0; i <= 10; i++) {
            System.out.print("a");
            try { // 0 <= x < 1000
                Thread.sleep((int) (Math.random() * 1000));
            } catch (Exception e) {
            }
        }
    }
    public synchronized void b () {
        for (int i = 0; i <= 10; i++) {
            System.out.print("b");
            try { // 0 <= x < 1000
                Thread.sleep((int) (Math.random() * 1000));
                } catch (Exception e) {
                }
            }
    }

    public synchronized void c () {
        for (int i = 0; i <= 10; i++) {
            System.out.print("c");
            try { // 0 <= x < 1000
                Thread.sleep((int) (Math.random() * 1000));
                } catch (Exception e) { }
            }
    }
}

class MyTheread3 extends Thread{
    private Cube cube;
    private int flag;

    public MyTheread3(Cube cube, int flag){
        this.cube = cube;
        this.flag = flag;
    }

    @Override
    public void run() {
        if(flag==1){
            cube.a();
        } else if(flag==2){
            cube.b();
        } else cube.c();
    }
}

