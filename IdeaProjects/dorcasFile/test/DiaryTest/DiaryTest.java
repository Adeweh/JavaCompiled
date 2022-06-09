//package DiaryTest;
//
//import Diary.Diary;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import java.util.Date;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class DiaryTest {
//    Date date;
//
//    @BeforeEach
//    void setUp() {
//        Diary.setSpecialId();
//    }
//    @Test
//    public void testThatWeHaveADiary(){
//        Diary testDiary = new Diary("Dorcas");
//
//        assertNotNull(testDiary);
//
//    }
//
//    @Test
//    public void testThatWeCanCreateID(){
//        Diary testDiary = new Diary("Dorcas");
//        testDiary.setId(1);
//        //testEntry.setId(2);
//        //testEntry.getId();
//        assertEquals(1, testDiary.getId());
//
//    }
//    @Test
//    public void testThatWeCanNameDiary(){
//        Diary testDiary = new Diary("Dorcas");
//        //testDiary.setName("Dorcas");
//        assertEquals("Dorcas", testDiary.getName());
//
//    }
//    @Test
//    public void testForDiaryDate(){
//        Diary testDiary = new Diary("Dorcas");
//        date = new Date();
//        testDiary.getDate();
//        assertEquals(date, testDiary.getDate());
//
//    }
//    @Test
//    public void testThatDiaryCanMakeEntry(){
//        Diary testDiary = new Diary("Dorcas");
//        DiaryEntry newEntry = new DiaryEntry("Dorcas");
//        newEntry.setTitle("Wonders");
//        newEntry.setBody("Personal");
//
//        testDiary.addEntry(newEntry);
//        System.out.println(testDiary.getEntry(1));
//
//        assertEquals(testDiary.getEntry(1),newEntry);
//    }
//    @Test
//    public void testThatDiaryGetAllEntries(){
//        Diary testDiary = new Diary("Dorcas");
//        DiaryEntry newEntry = new DiaryEntry("Dorcas");
//        newEntry.setTitle("Wonders");
//        newEntry.setBody("Personal");
//
//        testDiary.addEntry(newEntry);
//        testDiary.getEntry(1);
//
//        newEntry = new DiaryEntry("kk");
//        newEntry.setTitle("koko");
//        newEntry.setBody("love");
//
//        testDiary.addEntry(newEntry);
//
//        System.out.println(testDiary.getAllEntries());
//
//
//    }
//    @Test
//    public void testThatDiaryCanEdit(){
//        Diary testDiary = new Diary("Dorcas");
//        DiaryEntry newEntry = new DiaryEntry("Dorcas");
//        newEntry.setTitle("Wonders");
//        newEntry.setBody("Personal");
//
//        testDiary.addEntry(newEntry);
//        testDiary.getEntry(1);
//
//        newEntry = new DiaryEntry("kk");
//        newEntry.setTitle("koko");
//        newEntry.setBody("love");
//
//        testDiary.addEntry(newEntry);
//        System.out.println(testDiary.getAllEntries());
//
//        testDiary.editEntry(1,"dodo","food");
//        System.out.println("AFTER EDIT");
//
//        System.out.println(testDiary.getAllEntries());
//
//
//    }
//    @Test
//    public void testThatDiaryCanDelete(){
//        Diary testDiary = new Diary("Dorcas");
//        DiaryEntry newEntry = new DiaryEntry("Dorcas");
//        newEntry.setTitle("Wonders");
//        newEntry.setBody("Personal");
//
//        testDiary.addEntry(newEntry);
//        testDiary.getEntry(1);
//
//        newEntry = new DiaryEntry("kk");
//        newEntry.setTitle("koko");
//        newEntry.setBody("love");
//
//        testDiary.addEntry(newEntry);
//
//        System.out.println(testDiary.getAllEntries());
//        testDiary.deleteEntry(2);
//        System.out.println("AFTER DELETE");
//        System.out.println(testDiary.getAllEntries());
//
//
//    }
//
//
//
//}