package hijava.collections;

import java.util.ArrayList;
import java.util.List;

public class Queue
{
    static List<String> list = new ArrayList<>();

    public void enQueue(String i)
    {
        System.out.println("enQueue : " + i);
        list.add(i);
    }

    public void deQueue()
    {
        System.out.println("deQueue : " + list.get(0));
        list.remove(list.get(0));
    }

    @Override
    public String toString()
    {
        return list.toString();
    }
    public static void main(String[] args)
    {
        Queue queue = new Queue();
        queue.enQueue("Hong");
        queue.enQueue("Kim");
        queue.enQueue("Top");

        queue.deQueue();
        queue.deQueue();
        queue.enQueue("Yoon");
        queue.deQueue();

        System.out.println(queue);
    }

}
