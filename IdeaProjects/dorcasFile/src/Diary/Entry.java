package Diary;

import java.util.Date;

public class Entry {

    private String name;
    private int id;

    private static int specialId;
    private String title;
    private String body;
    Date dateCreated;


    public Entry(String name) {
        this.name = name;
        id = ++specialId;
        dateCreated = new Date();

    }

    public static void setSpecialId() {
        specialId = 0;
    }


    public int getId() {
        return id;
    }

    /*public void setId(int id) {
        this.id = id;
    }

     */

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Date getDate() {
        return dateCreated;
    }

    public String toString() {
        String data = """
                id -> %d
                title -> %s
                body -> %s
                dateCreated -> %s
                """;
        data = data.formatted(getId(), getTitle(), getBody(), getDate());
        return data;
    }


}

