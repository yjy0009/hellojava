package hijava.oop;

/**
 * 멤버변수
 * - amount(잔액) , name(이름)
 * 멤버함수
 * - Man() : 생성자 함수 - 초기 잔액을 10,000원 으로 Set!!
 * - buyCoffee(int Count) , buyDount(int Count)
 */
public class Man
{
    private static final int COFFEE = 3000; // 고정값은 상수변수로
    private static final int DONUT = 2500; // 고정값은 상수변수로

    private int amount;
    private String name;

    public Man()
    {
        this.amount = 10000; // 초기 잔액을 10000원으로 세팅
    }

    public Man(String name)
    {
        this();
        this.name = name;
    }

    public int getAmount()
    {
        return amount;
    }

    public void setAmount(int amount)
    {
        this.amount = amount;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void buyCoffee(int count)
    {
        subAmount(COFFEE, count);
    }

    public void buyDount(int count)
    {
        subAmount(DONUT, count);
    }

    public String toString()
    {
        return this.name + " 님의 잔액은 " + this.amount + " 원 입니다. ";
    }

    // 밖에서 호출 불가
    private void subAmount(int price, int count)
    {
//        this.amount -= ( price * count + (price * count) * 0.1 ); 부가세 별도
        this.amount -= price * count;
    }
}
