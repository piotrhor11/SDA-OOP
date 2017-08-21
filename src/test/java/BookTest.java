import AuthorAndBook.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class BookTest {

    Author testAuthor;
    Book testObject1;
    Book testObject2;

    Author testAuthor2 = new Author("Piotrek","piotrek@piotrek.com",'m');

    @Before
    public void init(){
        testAuthor = mock(Author.class);
        testObject1 = new Book("Book",testAuthor,19.99);
        testObject2 = new Book("Book",testAuthor,19.99,134);
    }

    @Test
    public void createBookWithoutQuantityTest(){
        Assert.assertNotNull(testObject1);
    }

    @Test
    public void createBookWithQuantityTest(){
        Assert.assertNotNull(testObject2);
    }

    @Test
    public void toStringTest(){
        when(testAuthor.toString()).thenReturn("Author[name='piotrek', email=piotrek@piotrek.com, gender=Male]");
        Assert.assertEquals("Book[name=Book, Author[name='piotrek', email=piotrek@piotrek.com, gender=Male], price=19.99, qty=0]",testObject1.toString());
    }

    @Test
    public void setPriceTest(){
        testObject1.setPrice(20.49);
        Assert.assertEquals(20.49,testObject1.getPrice(),0.01);
    }

    @Test
    public void setQuantityTest(){
        testObject1.setQty(10);
        Assert.assertEquals(10,testObject1.getQty());
    }
}
