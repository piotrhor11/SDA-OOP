import org.junit.Assert;
import org.junit.Test;
import Circle.*;

public class CircleTest {

    @Test
    public void circleSimpleArea(){
        Circle testObject = new Circle();
        Assert.assertEquals(3.14,testObject.getArea(),0.01);    //delta jest istotna przy floatach
    }

    @Test
    public void circleSimpleRadious(){
        Circle testObject = new Circle();
        Assert.assertEquals(1.0,testObject.getRadious(),0.01);
    }

    @Test
    public void circleWithRadiousArea(){
        Circle testObject = new Circle(5.0);
        Assert.assertEquals(78.5,testObject.getArea(),0.1);
    }

    @Test
    public void  circleWithRadiousRadious(){
        Circle testObject = new Circle(5.0);
        Assert.assertEquals(5.0,testObject.getRadious(),0.01);
    }

    @Test
    public void circleWithRadiousAndColor(){
        Circle testObject = new Circle(6.0, "blue");
        Assert.assertEquals(6.0,testObject.getRadious(),0.01);
        Assert.assertEquals("blue",testObject.getColor());
    }

    @Test
    public void circleWithRadiousAndColorToString(){
        Circle testObject = new Circle(7.0, "green");
        Assert.assertEquals("Circle[radious=7.0, color=green]",testObject.toString());
    }

    @Test
    public void setRadious(){
        double radious = 8.0;
        Circle testObject = new Circle();
        testObject.setRadious(radious);
        Assert.assertEquals(radious,testObject.getRadious(),0.01);
    }

    @Test
    public void setColor(){
        String color = "pink";
        Circle testObject = new Circle();
        testObject.setColor(color);
        Assert.assertEquals(color,testObject.getColor());
    }
}
