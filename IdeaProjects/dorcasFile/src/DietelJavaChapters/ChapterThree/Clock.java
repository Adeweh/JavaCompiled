package DietelJavaChapters.ChapterThree;

public class Clock {
    private int hour;
    private int minute;
    private int second;
    private String displayTime;

    public Clock (int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        this.displayTime = hour + ":" + minute + ":" + second;
        if (this.hour >23){this.hour = 0;}
        if (this.hour >23) {this.minute = 0;}
        if (this.hour >23){second = 0;}
        if (this.minute >59){this.hour = 0;}
        if (this.minute >59) {this.minute = 0;}
        if (this.minute >59){this.second = 0;}
        if (this.second >59){this.hour = 0;}
        if (this.second >59) {this.minute = 0;}
        if (this.second >59){this.second = 0;}

    }
    public void setHour(int hour){
        this.hour = hour;
    }
    public void setMinute(int minute){
        this.minute = minute;
    }
    public void setSecond(int second){
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
    public String displayTime () {
        return displayTime;
    }


}
