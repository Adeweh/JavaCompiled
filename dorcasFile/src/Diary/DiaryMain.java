package Diary;

public class DiaryMain {
    private static Diary diaryCreate = new Diary("Dorcas");
    private static User dorcas = new User();

    private static Entry entrydiary = new Entry("Dorcas");

    public static void main(String[] args) {
        createDiary();
        viewDiary();
        viewId();

    }
    private static void createDiary(){

       // diaryCreate.setName("Dorcas");
        diaryCreate.setId(1);


        dorcas.createDiary(diaryCreate);

    }
    private static void viewDiary(){

        System.out.print(dorcas.viewDiary(0));

    }
    private static void viewId(){

        System.out.print(entrydiary.getId());

    }
}
