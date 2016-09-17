import org.junit.Test;


import java.util.Stack;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by maitrayshah on 12/09/16.
 */
public class DriverTest {

    Stack_Implementation stackImplementation = new Stack_Implementation();
    Stack testStack = new Stack();

    @Test
    public void pushTest()
    {
        for (int i = 0 ; i<5 ; i++ )
        {
            stackImplementation.push(i);
            testStack.push(i);
        }
        String data1 = stackImplementation.toString();
        String data2 = testStack.toString();
        assertEquals(data1, data2);
    }

    @Test
    public void popTest()
    {
        for (int i = 0 ; i<5 ; i++ )
        {
            stackImplementation.push(i);
            testStack.push(i);
        }
        String data1 = stackImplementation.pop().toString();
        String data2 = testStack.pop().toString();
        assertEquals(data1,data2);
    }
}
