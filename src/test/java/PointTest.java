import MovablePoint.*;
import org.junit.*;

public class PointTest {

    Point testObject1;
    Point testObject2;

    @Before
    public void init(){
        testObject1 = new Point();
        testObject2 = new Point(3.4f, 5.6f);
    }

    @Test
    public void createPointWithoutCoordinates(){
        Assert.assertNotNull(testObject1);
    }

    @Test
    public void createPointWithCoordinates(){
        Assert.assertNotNull(testObject2);
    }

    @Test
    public void setXYTest(){
        testObject1.setXY(2.2f,3.3f);
        Assert.assertArrayEquals(new float[]{2.2f, 3.3f},testObject1.getXY(),0.01f);
    }

    @Test
    public void toStringTest(){
        Assert.assertEquals("(3.4, 5.6)",testObject2.toString());
    }

}
