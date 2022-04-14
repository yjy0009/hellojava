package hijava.inheritance;

import hijava.oop.Man;

public class American extends Man
{
    public American(String name)
    {
        super(name);
    }

    public void sayHello()
    {
        System.out.println("Hello");
        System.out.println("My Name is " + this.getName());
    }
}
