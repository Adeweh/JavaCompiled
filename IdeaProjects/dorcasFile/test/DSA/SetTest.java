package DSA;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SetTest {
    Set set;


    @BeforeEach
    void setup(){
        set = new Set();

    }
    @Test
    void  setIsEmpty(){
        assertTrue(set.isEmpty());
    }
    @Test
    void addToSet(){
        set.add("Dorcas");


        assertFalse(set.isEmpty());
    }
    @Test
    void removeFromSet(){
        set.add("Dorcas");
        set.add("Eden");
        set.add("Tola");
        set.add("Dorcas");

        set.remove("Eden");

        assertEquals(2, set.size());
    }
    @Test
    void testThatItemCanBeGotten(){
        set.add("Dorcas");
        set.add("Tola");
        String itemOne = set.getIndex(0);
        String itemTwo = set.getIndex(1);
        assertEquals("Tola", itemTwo);
    }
    @Test
    void testThatItemCanBeRemovedAtDifferentIndexes(){
        set.add("Dorcas");
        set.add("Tola");
        set.add("Eden");
        set.remove("Tola");

        var result = set.getIndex(1);
        assertEquals("Eden", result);

    }
    @Test
    void testThatDuplicateItemsCannotBeAdded(){
        set.add("Dorcas");
        set.add("Tola");
        set.add("Eden");
        set.add("Bread");

        assertTrue(set.contains("Eden"));
       // assertTrue(set.contains("Tola"));


    }


}
