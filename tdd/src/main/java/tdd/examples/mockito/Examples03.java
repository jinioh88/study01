package tdd.examples.mockito;

import java.util.LinkedList;

import static org.mockito.Mockito.*;


public class Examples03 {
    public static void main(String[] args) {
        LinkedList mockedList = mock(LinkedList.class);

        when(mockedList.get(anyInt())).thenReturn("int");
        when(mockedList.add(anyFloat())).thenReturn(true);
        when(mockedList.add(anyString())).thenReturn(true);

        System.out.println(mockedList.get(999)); // int
        System.out.println(mockedList.add(3.3f)); // true
        System.out.println(mockedList.add("string")); // true

        verify(mockedList).get(anyInt());
        verify(mockedList).add(eq( 3.3f ));  // eq : when에서 입력값이 정확히 3.3f를 넣었나 확인.
        verify(mockedList).add(eq("string"));
        //verify(mockedList).add(( 3.4f ));
    }
}

