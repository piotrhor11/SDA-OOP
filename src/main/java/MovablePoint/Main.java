package MovablePoint;

public class Main {

    public static void main(String[] args) {

        MovablePoint movablePoint1 = new MovablePoint(1.6f, 2.7f, 3.2f, 4.5f);
        System.out.println(movablePoint1.toString());
        System.out.println(movablePoint1.move().toString());
    }
}
