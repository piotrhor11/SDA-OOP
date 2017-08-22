package GeometricFigures;

public class Main {

    public static void main(String[] args) {
        Shape shape = new Shape("yellow", true);
        System.out.println(shape);

        Circle circle = new Circle(2.5,"gree",true);
        System.out.println(circle);

        Ractangle ractangle = new Ractangle(2.0, 4.0, "pink", false);
        System.out.println(ractangle);
    }
}
