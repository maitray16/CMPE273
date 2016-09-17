import org.junit.Test;

import java.util.Comparator;
import java.util.Queue;

import static org.junit.Assert.*;

/**
 * Created by maitrayshah on 09/09/16.
 */
public class Queue_sampleTest {

    Queue_sample queueSample = new Queue_sample();
    static Queue<Customer_Complaint> complaint_priority_queue;

    @Test
    public void add_complaint(Comparator<Customer_Complaint> id_comparator) throws Exception
    {
        queueSample.add_complaint(id_comparator);

    }

    @Test
    public void show_waitlist() throws Exception {

    }

    public static Comparator<Customer_Complaint> id_comparator = new Comparator<Customer_Complaint>(){

        @Override
        public int compare(Customer_Complaint c1, Customer_Complaint c2) {
            return (int) (c1.getId() - c2.getId());
        }
    };

}