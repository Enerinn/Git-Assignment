import static org.junit.Assert.*;
import org.junit.Test;
public class unitTestTwo{
    divide obj=new divide();
    @Test (expected = java.lang.ArithmeticException.class)
    public void testDivide() {
        obj.divide(1,0);
    }
}
