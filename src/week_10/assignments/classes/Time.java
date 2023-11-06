package week_10.assignments.classes;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time() {
        long totalSecond = System.currentTimeMillis() / 1000;
        second = (int) (totalSecond % 60);
        minute = (int) ((totalSecond / 60) % 60);
        hour = (int) ((totalSecond / 3600) % 24);
    }

    public Time(long elapsedTime) {
        long totalSecond = elapsedTime / 1000;
        second = (int) (totalSecond % 60);
        minute = (int) ((totalSecond / 60) % 60);
        hour = (int) ((totalSecond / 3600) % 24);
    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
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

    public void setTime(long elapsedTime) {
        new Time(elapsedTime);
    }

    @Override
    public String toString() {
        return hour + ":" + minute + ":" + second;
    }
}
