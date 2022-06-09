package DiaryTest;

import Diary.Entry;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class EntryTest {
    Date date;

    @BeforeEach
    void setUp() {
       Entry.setSpecialId();
    }

    @Test

    public void testThatWeCanMakeAnEntry(){
       Entry testEntry = new Entry("Dorcas");

        assertNotNull(testEntry);

    }
    @Test
    public void testThatWeCanCreateID(){
        Entry testEntry = new Entry("Dorcas");
        //testEntry.setId(1);
        //testEntry.setId(2);
        //testEntry.getId();
        assertEquals(1, testEntry.getId());

        testEntry = new Entry("Dorcas");
        assertEquals(2, testEntry.getId());

    }
    @Test
    public void testThatWeCanHaveATitle(){
        Entry testEntry = new Entry("Dorcas");
        testEntry.setTitle("Truth");
        assertEquals("Truth", testEntry.getTitle());
    }

    @Test
    public void testForDiaryBody(){
        Entry testEntry = new Entry("Dorcas");
        testEntry.setBody("Becoming Truth is all we seek");
        assertEquals("Becoming Truth is all we seek", testEntry.getBody());

    }
    @Test
    public void testForEntryDate(){
        Entry testEntry = new Entry("Dorcas");
        date = new Date();
        testEntry.getDate();
        assertEquals(date, testEntry.getDate());

    }



}