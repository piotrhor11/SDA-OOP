package MyTime;

public class Main {

    public static void main(String[] args) {

        MyTime time = new MyTime(23, 59, 59);

        System.out.println(time.toString());

        System.out.println(time.nextSecond());

        System.out.println(time.previousSecond());

        System.out.println(time.nextMinute());

        System.out.println(time.previousMinute());

        System.out.println(time.nextHour());

        System.out.println(time.previousHour());

    }
}
