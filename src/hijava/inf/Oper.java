package hijava.inf;

public class Oper
{
    public int add(int x, int y)
    {
        return x + y;
    }

    public int sub(int x, int y)
    {
        return x - y;
    }

    // 2 * 3 = 2 + 2 + 2
    public void mul(int x, int y)
    {
        int result = 0;
        for (int i = 0; i < y; i++)
            result = add(result, x);

        System.out.println(result);
    }

    // 10 / 5 = (10-5) = 0 까지 반복 된 회수
    public void div(int x, int y)
    {
        int result = 0;
        while (x > 0)
        {
            result++;
            x = sub(x, y);
        }

        System.out.println(result);
    }

}
