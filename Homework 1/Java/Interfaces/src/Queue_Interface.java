/**
 * Created by maitrayshah on 06/09/16.
 */
interface Queue_Interface<M>
{
    Queue_Interface<M> enqu(M element);
    M dequ();
}
