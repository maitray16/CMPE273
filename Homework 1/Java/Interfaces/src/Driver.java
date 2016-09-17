import java.util.Random;

/**
 * Created by maitrayshah on 06/09/16.
 */
public class Driver {

    public static void main(String[] args)
    {
            Queue_Implementation main_queue = new Queue_Implementation();

            System.out.println("Adding random data in to the queue - ");
            for (int i = 0 ; i<4 ; i++ )
            {
                Random random = new Random();
                int n = random.nextInt(50);
                main_queue.enqu(n);

            }
        System.out.println(main_queue.toString()+"\n");

        System.out.println("Dequeing the first element - ");
        main_queue.dequ();
        System.out.println(main_queue.toString());
    }
}
