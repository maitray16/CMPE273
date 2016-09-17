import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static junit.framework.TestCase.assertEquals;


/**
 * Created by maitrayshah on 10/09/16.
 */
public class ArrayTest {

    Array_Main arrTest = new Array_Main();
    char mainarr[];
    int i;
    @Test
    public void printTest()
    {
        char list[] = {'A','C','Z'};
        mainarr = arrTest.print_data(list);

        assertEquals(mainarr,list);
    }

    @Test
    public void sortdataTest()
    {
        char list[] = {'B','C','Z'};
        Arrays.sort(list);
        assertEquals(i,0);

    }
}
