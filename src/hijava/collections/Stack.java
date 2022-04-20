package hijava.collections;

import java.util.ArrayList;
import java.util.List;

public class Stack
{
    static List<Integer> list = new ArrayList<>();

    public void push(int i)
    {
        System.out.println("PUSH : " + i);
        list.add(i);
    }

    public void pop()
    {
        int index = list.size() - 1;

        System.out.println("POP : " + list.get(index));
        list.remove(list.get(index));
    }

    @Override
    public String toString()
    {
        return list.toString();
    }

    public static void main(String[] args)
    {
        Stack stack = new Stack();
        stack.push(3);
        stack.push(4);
        stack.push(5);

        stack.pop();
        stack.pop();
        stack.push(55);
        stack.pop();

        System.out.println(stack);
    }
}
