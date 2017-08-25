package MyTime;

public class MyTime {

    private int hour = 0;
    private int minute = 0;
    private int second = 0;

    public MyTime() {
    }

    public MyTime(int hour, int minute, int second) {
        System.out.printf("Provided data:\n %d for hours,\n %d for minutes, \n %d for seconds.\n", hour, minute, second);
        setTime(hour, minute, second);
    }

    public void setTime(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour < 24) {
            this.hour = hour;
        } else {
            System.out.printf("%d is not valid hour[0...23]! \n", hour);          //ToDo Zamienić na wyjątek!
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute < 60) {
            this.minute = minute;
        } else {
            System.out.printf("%d is not valid minute[0...59]! \n", minute);              //ToDo Zamienić na wyjątek!
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second >= 0 && second < 60) {
            this.second = second;
        } else {
            System.out.printf("%d is not valid second[0...59]! \n", second);              //ToDo Zamienić na wyjątek!
        }
    }

    public MyTime nextHour() {
        this.hour = (this.hour + 1) % 24;
        return this;
    }

    public MyTime previousHour() {
        this.hour -= 1;
        if (this.hour < 0) {
            this.hour += 24;
        }
        return this;
    }

//    public MyTime nextMinute() {
//        this.minute += 1;
//        if (this.minute >= 60) {
//            this.minute %= 60;
//            return nextHour();
//        } else
//            return this;
//    }

    public MyTime nextMinute() {            // Podejście do
        this.minute += 1;
        if (this.minute >= 60) {
            this.minute %= 60;
            return nextHour();
        } else
            return this;
    }

    public MyTime previousMinute() {
        this.minute -= 1;
        if (this.minute < 0) {
            this.minute += 60;
            return previousHour();
        } else
            return this;
    }

    public MyTime nextSecond() {
        this.second += 1;
        if (this.second >= 60) {
            this.second %= 60;
            return nextMinute();
        } else {
            return this;
        }
    }

    public MyTime previousSecond() {
        this.second -= 1;
        if (this.second < 0) {
            this.second += 60;
            return previousMinute();
        } else {
            return this;
        }
    }

//    @Override
//    public String toString(){
//        return "%02d:%02d:%02%", hour,minute,second;            //ToDo Co tu jest zwracane?
//    }

//    @Override
//    public String toString() {                                          //Doklejamy z przodu 0 i zwracamy 2 ostatnie znaki.
//
//        String printHour = "0" + hour;
//        char hourFirstDigit = printHour.charAt(printHour.length() - 2);
//        char hourSecondDigit = printHour.charAt(printHour.length() - 1);
//
//        String printMinute = "0" + minute;
//        char minuteFirstDigit = printMinute.charAt(printMinute.length() - 2);
//        char minuteSecondDigit = printMinute.charAt(printMinute.length() - 1);
//
//        String printSecond = "0" + second;
//        char secondFirstDigit = printSecond.charAt(printSecond.length() - 2);
//        char secondSecondDigit = printSecond.charAt(printSecond.length() - 1);
//
//        return "" + hourFirstDigit + hourSecondDigit + ":" +
//                minuteFirstDigit + minuteSecondDigit + ":" +
//                secondFirstDigit + secondSecondDigit;
//
//    }


}