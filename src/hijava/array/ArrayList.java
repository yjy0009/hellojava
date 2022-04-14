package hijava.array;

import hijava.oop.Man;

import java.util.List;

public class ArrayList
{
    public static void main(String[] args)
    {
        List<Man> people = new java.util.ArrayList<>();
        for (int i = 1; i < 10; i++)
            people.add(new Man("김" + i + "수"));

        for (Man person : people)
        {
            person.buyCoffee(1);
            System.out.println(person.toString());
        }


        List<Man> people2 = new java.util.ArrayList<>();
        for (int i = 1; i < 10; i++)
        {
            Man m = new Man("김" + i + "수");
            m.buyCoffee(1);
            people2.add(m);
        }

        int size = people2.size();
        for (int i = 0; i < size; i++)
        {
            System.out.println(people2.get(i));
        }
    }
}
