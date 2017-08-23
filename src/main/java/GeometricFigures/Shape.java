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
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("A Shape with color of ");
        sb.append(_color);
        sb.append(_filled?"filled":"not filled");
        return  sb.toString();
    }
}
