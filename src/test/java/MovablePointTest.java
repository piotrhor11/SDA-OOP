import MovablePoint.*;
import org.junit.*;
import static org.mockito.Mockito.*;

public class MovablePointTest {

    MovablePoint testObject1;
    MovablePoint testObject2;
    MovablePoint testObject3;
    Point testPoint1;
    Point testPoint2;

    @Before
    public void init(){
        testPoint1 = mock(Point.class);
        testPoint2 = mock(Point.class);
        testObject1 = new MovablePoint();
        testObject2 = new MovablePoint(0.1f, 2.3f);
        testObject3 = new MovablePoint(4.5f, 6.7f, 8.9f, 10.11f );
    }

    @Test
    public void createMovablePointWithoutArguments(){
        Assert.assertNotNull(testObject1);
    }

    @Test
    public void createMovablePointWithSpeed(){
        Assert.assertNotNull(testObject2);
    }

    @Test
    public void createMovablePointWithSpeedAndCoordinates(){
        Assert.assertNotNull(testObject3);
    }

    @Test
    public void setSpeedTest(){
        testObject1.setSpeed(1.1f, 2.2f);
        Assert.assertArrayEquals(new float[]{1.1f, 2.2f},testObject1.getSpeed(),0.01f);
    }

    @Test
    public void moveTest(){                             //ToDo Moki w dziedziczeniu to inna bajka :(
        when(testPoint2.getX()).thenReturn(8.9f);
        when(testPoint2.getY()).thenReturn(10.11f);
        Assert.assertEquals(new MovablePoint(4.5f, 6.7f, 83.4f, 16.81f),testObject3.move());
    }

}
