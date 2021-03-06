package GeometricFigures;

public class Circle extends Shape{

    private double _radious = 1.0;

    public Circle(){}

    public Circle(double radious){
        _radious = radious;
    }

    public Circle(double radious, String color, boolean filled){
        super(color,filled);
        _radious = radious;
    }

    public double getRadious() {
        return _radious;
    }

    public void setRadious(double radious) {
        _radious = radious;
    }

    public double getArea(){
        return Math.PI * Math.pow(_radious, 2d);
    }

    public double getPerimeter(){
        return 2 * Math.PI * _radious;
    }

    @Override
    public String toString() {                      //ToDo
        StringBuilder sb = new StringBuilder()
            .append("A Circle with radious=")
            .append(_radious)
            .append(", which is a subclass of ")
            .append(super.toString());
        return sb.toString();
    }
}
