package Stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    Stack stack;

    @BeforeEach
    public void setUp(){
        stack = new Stack();
        stack.StackSize(5);
    }

    @Test
    public void StackIsEmptyTest(){
        assertTrue(stack.isEmpty());
    }

    @Test
    public void StackPushTest(){
        stack.push(12);
        assertFalse(stack.isEmpty());
    }

    @Test
    public void stackPopTest(){
        stack.push(34);
        stack.pop();
        assertTrue(stack.isEmpty());
    }

}