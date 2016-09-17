/**
 * Created by maitrayshah on 09/09/16.
 */
public class Multi_Sample {

    public static void main(String[] args)
    {
        System.out.println("Calculation using Multithreading - \n");
        System.out.println("Equation to be solved = (1*2*3)/(1+1+1) \n");
        System.out.println("First thread is responsible for addition operation \n");
        System.out.println("Second thread is responsible for multiplication operation \n");

        Addition add = new Addition();
        Multiplication mult = new Multiplication();
        add.start();
        mult.start();

        try
        {
            add.join();
            mult.join();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        double result = ((double)mult.data/add.data);
        displayResult(result);
    }

    public static double displayResult(double x)
    {
        System.out.println(x);
        return x;
    }

    public static class Multiplication extends Thread
    {

        int data;
        public void run()
        {
            data = 1 * 2 * 3;
        }
    }

    public static class Addition extends Thread
    {

        int data;
        public void run()
        {
            data = 1 + 1 + 1;
        }
    }

}

