public class Time {
    // Attributes

    private int hour;
    private int minute;
    private int second;

    // non-default constructor (Parametrized Constructor)
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // methods
    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getSecond() {
        return this.second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
    }

    public int nextSecond() {
        this.second = second + 1;
        return (this.second);
    }

    public int previousSecond() {
        this.second = second - 1;
        return (this.second);
    }
}


