package Diary;

import java.util.ArrayList;

public class User {
    private int Id;

    private static int specialId;

    private ArrayList<Diary> diaries;

    public User(){
        diaries = new ArrayList<>();
        Id = specialId;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }
    public static void setSpecialId() {
        specialId = 0;
    }

    public void createDiary(Diary book){
        diaries.add(book);
    }
    public Diary viewDiary(int index){
        return  diaries.get(index);
    }
    public void viewAllDiaries(){
        for (int i = 0; i < diaries.size(); i++) {
            System.out.print(viewDiary(i));
        }
    }
    public void editEntry(int index) {
//        getEntry(index).setTitle();
    }
    public  void deleteDiary(int index){
        diaries.remove(index);
    }
}



