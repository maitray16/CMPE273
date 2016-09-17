/**
 * Created by maitrayshah on 06/09/16.
 */
public class Queue_Implementation<M> implements Queue_Interface<M>
{

    private M[] data_array;
    private int total, head , next;

    public Queue_Implementation()
    {
        data_array = (M[]) new Object[2];
    }

    public Queue_Implementation<M> enqu(M data)
    {
        if (data_array.length == total)
        {
            increaseSize(data_array.length * 2);
        }
        data_array[next++] = data;

        if (next == data_array.length)
        {
            next = 0;
        }
        total++;
        return this;
    }

    private void increaseSize(int capacity)
    {
        M[] tmp = (M[]) new Object[capacity];

        for (int i = 0; i < total; i++)
        {
            tmp[i] = data_array[(head + i) % data_array.length];    
        }
        data_array = tmp;
        head = 0;
        next = total;
    }

    public M dequ()
    {
        if (total == 0)
        {
            throw new java.util.NoSuchElementException();
        }
        M data = data_array[head];
        data_array[head] = null;
        if(++head == data_array.length)
        {
            head = 0;
        }
        return data;
    }

    @Override
    public String toString()
    {
        return java.util.Arrays.toString(data_array);
    }

}
