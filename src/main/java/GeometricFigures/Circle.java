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
        this._radious = radious;
    }

    public double getArea(){
        return Math.PI * Math.pow(_radious, 2d);
    }

    @Override
    public String toString() {                      //ToDo
        StringBuilder sb = new StringBuilder();
        sb.append("A Circle with radious=")
            .append()
                .append()
    }
}
