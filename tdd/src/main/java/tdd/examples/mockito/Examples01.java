package tdd.examples.mockito;

import java.util.List;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

// Mocking과 Verification
public class Examples01 {
    public static void main(String[] args){
        // mock 인터페이스 목으록 만듬
        List mockedList = mock(List.class);

        // mock 사용하기
        mockedList.add("one");
        mockedList.clear();

        // verification
        verify(mockedList).add("one");
        verify(mockedList).clear();
       // verify(mockedList).remove(1);
    }
}
