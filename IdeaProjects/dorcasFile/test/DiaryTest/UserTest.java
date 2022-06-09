//package DiaryTest;
//
//import Diary.Diary;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class UserTest {
//    @BeforeEach
//    void setUp() {
//        Diary.setSpecialId();
//
//    }
//        @Test
//        public void testThatThereIsUser(){
//            DiaryUser testUser = new DiaryUser();
//
//            assertNotNull(testUser);
//        }
//        @Test
//        public void testThatWeCanCreateID(){
//            DiaryUser testUser = new DiaryUser();
//            testUser.setId(1);
//            //testEntry.setId(2);
//            //testEntry.getId();
//            assertEquals(1, testUser.getId());
//
//        }
//        /*
//    @Test
//    public void testThatWeCanCreateDiary(){
//
//        DiaryUser testUser = new DiaryUser();
//        //DiaryEntry newEntry = new DiaryEntry("Dorcas");
//        testUser.createDiary();
//
//        assertEquals(1,testUser.viewDiary());
//    }
//
//     }
//        @Test
//        public void testForDiaryDate(){
//            DiaryMain testDiary = new DiaryMain("Dorcas");
//            date = new Date();
//            testDiary.getDate();
//            assertEquals(date, testDiary.getDate());
//
//        }
//        @Test
//        public void testThatDiaryCanMakeEntry(){
//            DiaryMain testDiary = new DiaryMain("Dorcas");
//            DiaryEntry newEntry = new DiaryEntry("Dorcas");
//            newEntry.setTitle("Wonders");
//            newEntry.setBody("Personal");
//
//            testDiary.addEntry(newEntry);
//            System.out.println(testDiary.getEntry(1));
//
//            assertEquals(testDiary.getEntry(1),newEntry);
//        }
//        @Test
//        public void testThatDiaryGetAllEntries(){
//            DiaryMain testDiary = new DiaryMain("Dorcas");
//            DiaryEntry newEntry = new DiaryEntry("Dorcas");
//            newEntry.setTitle("Wonders");
//            newEntry.setBody("Personal");
//
//            testDiary.addEntry(newEntry);
//            testDiary.getEntry(1);
//
//            newEntry = new DiaryEntry("kk");
//            newEntry.setTitle("koko");
//            newEntry.setBody("love");
//
//            testDiary.addEntry(newEntry);
//
//            System.out.println(testDiary.getAllEntries());
//
//
//        }
//        @Test
//        public void testThatDiaryCanEdit(){
//            DiaryMain testDiary = new DiaryMain("Dorcas");
//            DiaryEntry newEntry = new DiaryEntry("Dorcas");
//            newEntry.setTitle("Wonders");
//            newEntry.setBody("Personal");
//
//            testDiary.addEntry(newEntry);
//            testDiary.getEntry(1);
//
//            newEntry = new DiaryEntry("kk");
//            newEntry.setTitle("koko");
//            newEntry.setBody("love");
//
//            testDiary.addEntry(newEntry);
//            System.out.println(testDiary.getAllEntries());
//
//            testDiary.editEntry(1,"dodo","food");
//            System.out.println("AFTER EDIT");
//
//            System.out.println(testDiary.getAllEntries());
//
//
//        }
//        @Test
//        public void testThatDiaryCanDelete(){
//            DiaryMain testDiary = new DiaryMain("Dorcas");
//            DiaryEntry newEntry = new DiaryEntry("Dorcas");
//            newEntry.setTitle("Wonders");
//            newEntry.setBody("Personal");
//
//            testDiary.addEntry(newEntry);
//            testDiary.getEntry(1);
//
//            newEntry = new DiaryEntry("kk");
//            newEntry.setTitle("koko");
//            newEntry.setBody("love");
//
//            testDiary.addEntry(newEntry);
//
//            System.out.println(testDiary.getAllEntries());
//            testDiary.deleteEntry(2);
//            System.out.println("AFTER DELETE");
//            System.out.println(testDiary.getAllEntries());
//
//
//        }
//
//  */
//
//
//
//
//    }
