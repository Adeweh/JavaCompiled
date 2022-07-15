package DSA;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    Stack stack;


    @BeforeEach
    void setup() {

        stack = new Stack(5);
    }

    @Test
    void testThatStackIsEmpty() {
        assertTrue(stack.isEmpty());
    }

    @Test
    void testThatWeCanFullStack() {
        stack.push(22);
        stack.push(19);
        stack.push(90);
        stack.push(77);
        stack.push(24);
        stack.push(55);

        assertTrue(stack.isFull());
        assertEquals(5, stack.size());

    }
    @Test
    void testThatWeCanRemoveFromStack() throws Exception {
        stack.push(22);
        stack.push(19);
        stack.push(90);
        stack.push(77);
        stack.push(24);
        System.out.println((stack.pop()));

        assertEquals(4, stack.size());
    }
    @Test
    void testThatWeCanPickTheLastElementFromStack(){
        stack.push(22);
        stack.push(19);
        stack.push(90);
        stack.push(77);
        stack.push(24);
        assertEquals(24, stack.peep());

    }
    @Test
    void testThatWeCanGetPositionOfElementsFromStack(){
        stack.push(22);
        stack.push(19);
        stack.push(90);
        stack.push(77);
        stack.push(24);

        assertEquals(2, stack.search(19));

    }
}

