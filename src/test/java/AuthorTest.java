import AuthorAndBook.*;
import org.junit.Assert;
import org.junit.Test;

public class AuthorTest {

    Author testObject = new Author("piotrek","piotrek@piotrek.pl",'m');

    @Test
    public void createAuthorTest(){
        Assert.assertNotNull(testObject);
    }

    @Test
    public void getNameTest(){
        Assert.assertEquals("piotrek",testObject.getName());
    }

    @Test
    public void getGenderTest(){
        Assert.assertEquals(new Character('m'),testObject.getGender());
    }

    @Test
    public void getEmailTest(){
        Assert.assertEquals("piotrek@piotrek.pl",testObject.getEmail());
    }

    @Test
    public void toStringTest(){
        Assert.assertEquals("Author[name='piotrek', email=piotrek@piotrek.pl, gender=Male]",testObject.toString());
    }

    @Test
    public void setEmailTest(){
        testObject.setEmail("grzegorz@piotrek.pl");
        Assert.assertEquals("grzegorz@piotrek.pl",testObject.getEmail());
    }
}
