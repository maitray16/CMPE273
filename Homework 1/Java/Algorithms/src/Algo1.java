/**
 * Created by maitrayshah on 06/06/16.
 */
public class Algo1 {

    Node head;

    static class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    
    public static void main(String[] args)
    {
        Algo1 list = new Algo1();

        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        first.next = second;
        second.next = third;
    }
}
