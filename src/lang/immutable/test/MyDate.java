package lang.immutable.test;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public MyDate(int year, int month, int day) {
        this.year= year;
        this.month= month;
        this.day = day;
    }

    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }
}
