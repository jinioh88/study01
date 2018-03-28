package examples;

import javax.swing.*;

public class BlogPrint {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();

        String input = JOptionPane.showInputDialog("문자 입력: ");
        System.out.println("입렵값음 : "+input);
    }
}

class MyThread extends Thread{
    public void run(){
        for(int i=10;i>0;i--){
            System.out.println(i);
            try{
                sleep(1000);
            } catch(Exception e ){}
        }
    }
}

