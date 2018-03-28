package tdd.examples.mockito;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;


public class Examples07 {
    @Mock private List mockedList;

    // 앞예제에서 처럼 목 생성 안해줘도 됨. 자동으로 해줌
    @Before
    public void initMocks() {

        MockitoAnnotations.initMocks(this); // mock all the field having @Mock annotation
    }

    @Test
    public void test() {
        // test here
        Mockito.verify(mockedList).add("one");
    }
}
