import java.time.MonthDay;

public class MonthDays {
    private int month;
    private int year;


    public MonthDays(int m, int y) {
        month = m;
        year = y;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumberOfDays()
    {
        int days = -1;

        boolean leap = false;
        if (this.year % 100 == 0) {
            if (this.year % 400 == 0)
                leap = true;
        }
        else {
            if (this.year % 4 == 0)
                leap = true;
        }

        switch (this.month)
        {
            case 1, 3, 5, 7, 8, 10, 12:
                days = 31;
                break;
            case 2:
                if (leap) days = 29;
                else days = 28;
                break;
            case 4, 6, 9, 11:
                days = 30;
                break;
        }

        return days;
    }
}
