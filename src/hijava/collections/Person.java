package hijava.collections;

public class Person<T>
{
    private T person;
    public void set(T person)
    {
        this.person = person;
    }

    public String getName()
    {
        return this.person.toString();
    }
}
