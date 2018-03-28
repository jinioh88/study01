package tdd.examples.mockito;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

// RunWith : @Before에서 초기화 하는거랑 같다 목객체 초기화. 이걸 더 추천함.
@RunWith(MockitoJUnitRunner.class)
public class Examples08 {
    @Mock
    private List mockedList;

    @Test
    public void test() {
        // test here
    }
}
