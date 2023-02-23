import static org. junit.Assert.*;  
  
import org.junit.Test;  
  

public class CalculatorTest {
    
    @Test
    public void testAdd() {
        int result = Calculator.add(10, 5);
        assertEquals(15, result);
    }

    @Test
    public void testAdd1() {
        int result = Calculator.add1(10, 5);
        assertEquals(15, result);
    }
   @Test
    public void testAdd1() {
        int result = Calculator.add2(10, 5);
        assertEquals(15, result);
    }

    @Test
    public void testSubtract() {
        int result = Calculator.subtract(10, 5);
        assertEquals(5, result);
    }
    
    @Test
    public void testMultiply() {
        int result = Calculator.multiply(10, 5);
        assertEquals(50, result);
    }
   @Test
    public void testDiv() {
        int result = Calculator.div(10, 5);
        assertEquals(50, result);
    }
}
