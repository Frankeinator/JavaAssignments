public class Month {
    private int monthNumber;

    public Month() {this.monthNumber = 1;}
    public Month(int m) {
        if (m < 13 && m > 0)
            this.monthNumber = m;
        else
            this.monthNumber = 1;
    }
    public Month(String m)
    {
        switch(m)
        {
            case "January":
                monthNumber = 1;
                break;
            case "February":
                monthNumber = 2;
                break;
            case "March":
                monthNumber = 3;
                break;
            case "April":
                monthNumber = 4;
                break;
            case "May":
                monthNumber = 5;
                break;
            case "June":
                monthNumber = 6;
                break;
            case "July":
                monthNumber = 7;
                break;
            case "August":
                monthNumber = 8;
                break;
            case "September":
                monthNumber = 9;
                break;
            case "October":
                monthNumber = 10;
                break;
            case "November":
                monthNumber = 11;
                break;
            case "December":
                monthNumber = 12;
                break;
            default:
                monthNumber = 1;
                break;

        }
    }

    public void setMonthNumber(int m)
    {
        if (m < 13 && m > 0)
            this.monthNumber = m;
        else
            this.monthNumber = 1;
    }

    public int getMonthNumber() {
        return monthNumber;
    }

    public String getMonthName() {
        return switch (this.monthNumber) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Not a month number.";
        };
    }

    public String toString()
    {
        return switch (this.monthNumber) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Not a month number.";
        };
    }

    public boolean equals(Month m)
    {
        return this.monthNumber == m.monthNumber;
    }

    public boolean lessThan(Month m)
    {
        return m.monthNumber < this.monthNumber;
    }

    public boolean greaterThan(Month m)
    {
        return m.monthNumber > this.monthNumber;
    }
}
