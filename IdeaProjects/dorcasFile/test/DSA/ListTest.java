package DSA;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ListTest {
    List list;

    @BeforeEach
    void setUp() {
        list = new ArrayList();
    }

    @Test
    void listIsEmpty() {
        assertTrue(list.isEmpty());
    }

    @Test
    void addToList() {
        list.add("Dorcas");
        list.add("Dorcas");
        assertFalse(list.isEmpty());
        assertEquals(2, list.size());
    }

    @Test
    void removeFromList() {
        list.add("Dorcas");
        list.add("Pearl");
        list.add("Bread");
        list.remove("Dorcas");
        assertFalse(list.isEmpty());
        assertEquals(2, list.size());
    }

    @Test
    void testThatItemCanBeGotten() {
        list.add("Bread");
        String itemOne = list.getIndex(0);
        assertEquals("Bread", itemOne);
    }

    @Test
    void testThatItemCanBeGottenAtDiffIndexes() {
        list.add("Dorcas");
        list.add("Pearl");
        list.add("Bread");
        var result = list.getIndex(2);
        assertEquals("Bread", result);
    }
    @Test
    void testThatItemCanBeRemovedAtDiffIndexes() {
        list.add("Dorcas");
        list.add("Pearl");
        list.add("Bread");
        list.remove("Dorcas");
        var result = list.getIndex(0);
        assertEquals("Pearl", result);

    }
    @Test
    public void addSixElement_capacityShouldDoubleTest(){
        assertEquals(5, list.capacity());

        list.add("Dorcas");
        list.add("Pearl");
        list.add("Bread");
        list.add("Eden");
        list.add("Babe");
        list.add("Wonders");
        list.add("Divine");
      //  System.out.println(list.capacity());
        assertEquals(10, list.capacity());

    }
    @Test
    public void testThatDuplicateItemsCountAsOne(){
        list.add("Dorcas");
        list.add("Dorcas");
        list.add("Pearl");
        list.add("Bread");

        list.remove("Bread");

        assertTrue(list.contains("Dorcas"));

    }



}
