import CustomerAndAccount.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CustomerTest {

    Customer testObject;

    @Before
    public void init(){
        testObject = new Customer(1,"piotrek",'m');
    }

    @Test
    public void createCustomerTest(){
        Assert.assertNotNull(testObject);
    }

    @Test
    public void getMethodsTest(){
        Assert.assertEquals(1,testObject.getID());
        Assert.assertEquals("piotrek",testObject.getName());
        Assert.assertEquals('m',testObject.getGender());
    }

    @Test
    public void toStringTest(){
        Assert.assertEquals("piotrek(1)",testObject.toString());
    }
}
