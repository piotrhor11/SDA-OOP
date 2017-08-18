package SimpleCircle;

public class SimpleCircle {

    private double _radius = 1.0;

    public SimpleCircle(){}

    public SimpleCircle(double radius){
        this._radius = radius;
    }

    public double getRadius() {
        return _radius;
    }

    public void setRadius(double radius) {
        this._radius = radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(_radius,2d);
    }

    public double getCircumference(){
        return 2 * Math.PI * _radius;
    }

    @Override
    public String toString() {
        StringBuilder response = new StringBuilder();
        response.append("Circle[radius=");
        response.append(_radius);
        response.append("]");
        return response.toString();
    }
}
