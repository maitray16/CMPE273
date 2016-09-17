import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by maitrayshah on 12/09/16.
 */
public class MultiTest {

    double a;
    Multi_Sample multiSample = new Multi_Sample();


    @Test
    public void displayTest()
    {
        double b = multiSample.displayResult(10);
        a = 10;
        assertEquals(b, a);
    }
}
