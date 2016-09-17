/**
 * Created by maitrayshah on 07/09/16.
 */
public class Stack_Implementation<M> implements Stack_Interface<M> {

    private M[] array;
    private int total;

    public Stack_Implementation()
    {
        array = (M[]) new Object[5];
    }

    public Stack_Implementation<M> push(M element)
    {
        array[total++] = element;
        return this;
    }

    public M pop()
    {
        if (total == 0) 
        {
            throw new java.util.NoSuchElementException();
        }
        M element = array[--total];
        array[total] = null;
       
        return element;
    }

    @Override
    public String toString()
    {
        return java.util.Arrays.toString(array);
    }

}