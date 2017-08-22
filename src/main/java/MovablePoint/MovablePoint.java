package MovablePoint;

public class MovablePoint extends Point {

    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint(){}

    public MovablePoint(float xSpeed, float ySpeed){
        super();
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed, float x, float y){
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed(){
        return new float[]{this.getXSpeed(),this.getYSpeed()};
    }

    public void setSpeed(float xSpeed, float ySpeed){
        this.setXSpeed(xSpeed);
        this.setYSpeed(ySpeed);
    }

    public MovablePoint move(){
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
        return this;
    }

    @Override
    public String toString() {
        return super.toString() + ", Speed(" + xSpeed + ", " + ySpeed + ')';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MovablePoint that = (MovablePoint) o;

        if (Float.compare(that.xSpeed, xSpeed) != 0) return false;
        return Float.compare(that.ySpeed, ySpeed) == 0;
    }

    @Override
    public int hashCode() {
        int result = (xSpeed != +0.0f ? Float.floatToIntBits(xSpeed) : 0);
        result = 31 * result + (ySpeed != +0.0f ? Float.floatToIntBits(ySpeed) : 0);
        return result;
    }
}
