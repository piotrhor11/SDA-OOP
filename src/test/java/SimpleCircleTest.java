import SimpleCircle.SimpleCircle;
import org.junit.Assert;
import org.junit.Test;

public class SimpleCircleTest {

    @Test
    public void creatSimpleCircle(){
        SimpleCircle testObject = new SimpleCircle();
        Assert.assertEquals("Circle[radius=1.0]",testObject.toString());
    }

    @Test
    public void createSimpleCircleWithRadius(){
        SimpleCircle testObject = new SimpleCircle(9d);
        Assert.assertEquals("Circle[radius=9.0]",testObject.toString());
    }

    @Test
    public void getRadiusCheck(){
        SimpleCircle testObject = new SimpleCircle(8d);
        Assert.assertEquals(8.0,testObject.getRadius(),0.01);
    }

    @Test
    public void setRadiusCheck(){
        SimpleCircle testObject = new SimpleCircle();
        testObject.setRadius(9d);
        Assert.assertEquals(9.0,testObject.getRadius(),0.01);
    }

}
