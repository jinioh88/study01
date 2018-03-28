package examples;

import java.io.FileOutputStream;

// read() 메서드는 byte를 리턴하는 것이 아니라 int를 반환
// EoF를 표현하기 위해. int의 마지막 바이트에만 값이 저장 된다. EoF는 음수값이다
public class IOExam03 {
    public static void main(String[] args) throws Exception {
        try(FileOutputStream fos = new FileOutputStream("data03.dat");){
            long start = System.currentTimeMillis();
            //int value = 0;
            //for(int i=0;i<1024*1024;i++){
            //    fos.write(value);
            //}
            byte[] buffer = new byte[1025];
            for(int i=0; i<124; i++){
                fos.write(buffer,0,1024);
            }
            long end = System.currentTimeMillis();
            System.out.println(end-start);
        }

    }
}

