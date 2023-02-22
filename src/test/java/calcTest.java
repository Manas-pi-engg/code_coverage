import static org. junit.Assert.*;  
  
import org.junit.Test;  
  

public class CalculatorTest {
    
    @Test
    public void testAdd() {
        int result = Calculator.add(10, 5);
        assertEquals(15, result);
    }
}
