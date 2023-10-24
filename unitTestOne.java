import static org.junit.Assert.*;
import org.junit.Test;
public class unitTestOne{
    divide obj=new divide();
    @Test
    public void testDivide()
    {
        assertEquals(2, obj.divide(10, 5));
    }
}
