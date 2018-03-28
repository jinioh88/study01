package examples;

// read() 메서드는 byte를 리턴하는 것이 아니라 int를 반환
// EoF를 표현하기 위해. int의 마지막 바이트에만 값이 저장 된다. EoF는 음수값이다
public class IOExam02 {
    public static void main(String[] args) throws Exception {
        int read;
        while((read = System.in.read())!= -1){ // EOF 까지 읽자
            System.out.write(read);
        }
    }
}

