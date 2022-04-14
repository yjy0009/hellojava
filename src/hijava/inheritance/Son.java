package hijava.inheritance;

/**
 * 생성자는 상속 불가
 *
 * */

public class Son extends Mom
{
    public Son()
    {
        super("아들");
    }

    public Son(String name)
    {
        super(name);
    }

    public void say()
    {
        System.out.println("Son Said ... ");
    }

    public void drinkMilk()
    {
        System.out.println("우유 먹자");
    }
}
