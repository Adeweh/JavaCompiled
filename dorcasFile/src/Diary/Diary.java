package Diary;

import java.util.ArrayList;
import java.util.Date;

public class Diary {
    private String name;

    private int Id;

    private static int specialId;

    Date dateCreated;

    private ArrayList<Entry> entries;

    public Diary(String name) {
        this.name = name;
        entries = new ArrayList<>();
        Id = specialId;
        dateCreated = new Date();

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


    public String getName() {
        return name;
    }

    /*public void setName(String name) {
        this.name = name;
    }

     */

    public Date getDate() {
        return dateCreated;
    }

    public void makeEntry(Entry newEntry) {
        entries.add(newEntry);
    }

    public void addEntry(Entry entry) {
        entries.add(entry);
    }

    public Entry getEntry(int index) {
        return entries.get(index - 1);
    }

    public String getAllEntries() {
        String output = "";
        for (int i = 0; i < entries.size(); i++) {
            Entry entry = entries.get(i);
            String data = """
                    id -> %d
                    title -> %s
                    body -> %s
                    dateCreated -> %s
                    """;
            data = data.formatted(entry.getId(), entry.getTitle(), entry.getBody(), entry.getDate());
            output += data;
        }
        return output;
    }

    public void editEntry(int id, String newTitle, String newBody) {
        for (int i = 0; i <entries.size() ; i++) {
            Entry entry = entries.get(i);
            if(entry.getId() == id){
                entry.setTitle(newTitle);
                entry.setBody(newBody);
                break;
            }
        }
    }

    public void deleteEntry(int id) {
        entries.remove(id-1);

    }

    // @Override
    public String toString() {
        String output = "";
        for (int i = 0; i < entries.size(); i++) {
            Entry entry = entries.get(i);
            String data = """
                    name -> %s
                    id -> %d
                    title -> %d
                    body -> %d
                    dateCreated -> %s
                    """;
            data = data.formatted(entry.getId(), entry.getTitle(), entry.getBody(), entry.getDate());
            output += data;
        }
        return output;
    }
}


