
import org.junit.Test;

import java.util.ArrayList;


import static junit.framework.TestCase.assertEquals;

/**
 * Created by maitrayshah on 12/09/16.
 */
public class DriverTest {

    Queue_Implementation queueImplementation = new Queue_Implementation();
    ArrayList<Integer> list = new ArrayList<>();

    @Test
    public void enquTest()
    {
        for (int i = 0 ; i<4 ; i++ )
        {
            queueImplementation.enqu(i);
        }

        for (int i = 0 ; i<4 ; i++ )
        {
            list.add(i);
        }
        String data1 = queueImplementation.toString();
        String data2 = list.toString();

        assertEquals(data1, data2);
    }

    @Test
    public void dequTest()
    {
        for (int i = 0 ; i<4 ; i++ )
        {
            queueImplementation.enqu(i);
        }

        for (int i = 0 ; i<4 ; i++ )
        {
            list.add(i);
        }

        String data1 = queueImplementation.dequ().toString();
        String data2 = list.remove(0).toString();

        assertEquals(data1,data2);

    }

}
