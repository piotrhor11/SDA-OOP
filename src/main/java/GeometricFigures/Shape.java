package GeometricFigures;

public class Shape {

    private String _color = "red";
    private boolean _filled = true;

    public Shape(){}

    public Shape(String color, boolean filled){
        _color = color;
        _filled = filled;
    }

    public String getColor() {
        return _color;
    }

    public void setColor(String color) {
        this._color = color;
    }

    public boolean isFilled() {
        return _filled;
    }

    public void setFilled(boolean filled) {
        this._filled = filled;
    }

    @Override
    public String toString() {          //ToDo
        return "Shape{" +
                "_color='" + _color + '\'' +
                ", _filled=" + _filled +
                '}';
    }
}
