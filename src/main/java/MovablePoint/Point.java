package MovablePoint;

public class Point {

    private float x = 0.0f;
    private float y = 0.0f;

    public Point(){}

    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY() {
        float[] xy = {this.getX(),this.getY()};
        return xy;
    }

    public void setXY(float x, float y) {
        this.setX(x);
        this.setY(y);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ')';            // Dziwne rzeczy wychodzą, jak się podmieni "(" na '('!!!
    }
}
