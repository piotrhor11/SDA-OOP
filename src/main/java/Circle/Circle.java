package Circle;

// Zadanie Slajd 9, 12
public class Circle {

    private double _radius = 1.0;
    private String _color = "red";

    public Circle(){ }

    public Circle(double radius){
        this._radius = radius;
    }

    public Circle(double radius, String color){
        this._radius = radius;
        this._color = color;
    }

    public double getRadius() {
        return _radius;
    }

    public void setRadius(double radius) {
        this._radius = radius;
    }

    public String getColor() {
        return _color;
    }

    public void setColor(String color) {
        this._color = color;
    }

    public double getArea(){
        return Math.PI * Math.pow(_radius, 2.0);
    }

    public String toString() {
        StringBuilder response = new StringBuilder();
        response.append("Circle[radius=");
        response.append(_radius);
        response.append(", color=");
        response.append(_color);
        response.append(']');
        return response.toString();
    }
}
