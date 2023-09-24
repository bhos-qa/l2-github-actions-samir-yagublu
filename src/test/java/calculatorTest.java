import junit.framework.TestCase;
import org.junit.Test;

public class calculatorTest extends TestCase {
@Test
    public void testAdd() {
       assertEquals(5,calculator.add(2,3));
    }

    public void testMultiply() {
    assertEquals(10, calculator.multiply(2,5));
    }
}