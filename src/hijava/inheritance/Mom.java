package hijava.inheritance;
/**
 * 모든 메소드에 this 라는 parameter가 숨겨져 있음
 * (같은 Method 지만, this를 달고 수행 됨)
 * getName(this) -> this 가 갊춰져 있는것 */
public class Mom
{
    private String name;

    public Mom()
    {
        this("엄마");
    }

    public Mom(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void eat()
    {
        System.out.println("EAT!!");
    }

    public void say()
    {
        System.out.println("Mom Said ... ");
    }

    public void drinkBeer()
    {
        System.out.println("맥주 마시자");
    }
}
