package tdd.DietelChapters;

import DietelJavaChapters.ChapterThree.Clock;

public class ClockTest {
        public static void main(String[] args){

            Clock deeClock = new Clock(9,22,32);

            System.out.printf("The time is %d:%d:%d " , deeClock.getHour(), deeClock.getMinute(), deeClock.getSecond(),deeClock.displayTime());
        }


}
