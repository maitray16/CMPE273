import java.util.Random;

/**
 * Created by maitrayshah on 07/09/16.
 */
public class Driver {

    public static void main(String[] args)
    {
        Stack_Implementation stackImplementation = new Stack_Implementation();

        System.out.println("PUSHING random data in to the stack - ");
        for (int i = 0 ; i<5 ; i++ )
        {
            Random random = new Random();
            int n = random.nextInt(50);
            stackImplementation.push(n);

        }

        System.out.println(stackImplementation.toString()+"\n");
        System.out.println("POPPING top data from stack - ");
        stackImplementation.pop();
        System.out.println(stackImplementation.toString());
    }
}
