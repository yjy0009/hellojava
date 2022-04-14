package hijava.inheritance;

import hijava.oop.Man;

public class Korean extends Man
{
    public Korean(String name)
    {
        super(name);
    }

    public void eatRice()
    {
        System.out.println("밥을 먹습니다.");
    }
}
