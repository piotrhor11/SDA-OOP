package Circle;

// Zadanie Slajd 9, 12
public class Circle {

    private double _radious = 1.0;
    private String _color = "red";

    public Circle(){ }

    public Circle(double radious){
        this._radious = radious;
    }

    public Circle(double radious, String color){
        this._radious = radious;
        this._color = color;
    }

    public double getRadious() {
        return _radious;
    }

    public void setRadious(double radious) {
        this._radious = radious;
    }

    public String getColor() {
        return _color;
    }

    public void setColor(String color) {
        this._color = color;
    }

    public double getArea(){
        return Math.PI * Math.pow(_radious, 2.0);
    }

    @Override
    public String toString() {
        StringBuilder response = new StringBuilder();
        response.append("Circle[radious=");
        response.append(_radious);
        response.append(", color=");
        response.append(_color);
        response.append(']');
        return response.toString();
    }
}
