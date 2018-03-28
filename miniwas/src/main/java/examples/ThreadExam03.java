package examples;

import java.util.ArrayList;
import java.util.List;

public class ThreadExam03 {
    public static void main(String[] args){
        Cube cube = new Cube();
        MyThread03 t1 = new MyThread03(cube, 1);
        MyThread03 t2 = new MyThread03(cube, 2);
        MyThread03 t3 = new MyThread03(cube, 3);
        t2.start();
        t3.start();
        t1.start();


    }
}

class Cube{
    int x = 1;
    public synchronized void a(){
        while(x != 1){
            try {
                wait();
            }catch(Exception ex){}
        }
        for (int i = 0; i < 10; i++) {
            System.out.print("a");
            try { // 0 <= x < 1000
                Thread.sleep((int) (Math.random() * 1000));
            } catch (Exception ex) {
            }
        }
        x = 2;
        notifyAll();
    }

    public synchronized void b(){
        while(x != 2){
            try {
                wait();
            }catch(Exception ex){}
        }
        for (int i = 0; i < 10; i++) {
            System.out.print("b");
            try { // 0 <= x < 1000
                Thread.sleep((int) (Math.random() * 1000));
            } catch (Exception ex) {
            }
        }
        x= 3;
        notifyAll();
    }

    public synchronized void c(){
        while(x != 3){
            try {
                wait();
            }catch(Exception ex){}
        }
        for (int i = 0; i < 10; i++) {
            System.out.print("c");
            try { // 0 <= x < 1000
                Thread.sleep((int) (Math.random() * 1000));
            } catch (Exception ex) {
            }
        }
        x= 1;
        notifyAll();
    }
}

class MyThread03 extends Thread{
    private Cube cube;
    private int flag;

    public MyThread03(Cube cube, int flag){
        this.cube = cube;
        this.flag = flag;
    }

    @Override
    public void run() {
        if(flag == 1)
            cube.a();
        else if(flag == 2)
            cube.b();
        else if(flag == 3)
            cube.c();
    }
}
